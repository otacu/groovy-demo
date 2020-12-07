package com.example.groovydemo.third.convert;

import com.example.groovydemo.pojo.common.MyOrderDeliveryInfo;
import com.example.groovydemo.pojo.common.MyOrderItemInfo;
import com.example.groovydemo.pojo.common.MyOrderPushInfo;
import com.example.groovydemo.pojo.common.MyResult;
import com.example.groovydemo.pojo.comone.ComOneConsignee;
import com.example.groovydemo.pojo.comone.ComOneCreateOrderRequest;
import com.example.groovydemo.pojo.comone.ComOneItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 转换成商壹创建订单请求
 */
@Slf4j
@Component
public class ConvertComoneCreateOrder {
    public MyResult convert(MyOrderPushInfo orderPushInfo) {
       try {
           ComOneCreateOrderRequest request = new ComOneCreateOrderRequest();
           MyOrderDeliveryInfo orderDelivery = orderPushInfo.getOrderDelivery();
           String postCode = orderDelivery.getPostCode();
           // 国家
           String countryCode = "MY";
           List<ComOneItem> comOneItemList = new ArrayList<>();
           List<MyOrderItemInfo> orderItemList = orderPushInfo.getOrderItemList();
           Boolean isCharge = false;
           Boolean isSeaShipping = false;
           BigDecimal exchangeRate = BigDecimal.ONE;
           BigDecimal packageWeight = BigDecimal.ZERO;
           for (MyOrderItemInfo orderItem : orderItemList) {
               ComOneItem comOneItem = new ComOneItem();
               comOneItem.setCname(orderItem.getSkuName());
               comOneItem.setName(orderItem.getSkuName());
               comOneItem.setNumber(String.valueOf(orderItem.getNum()));
               Float unitPrice = new BigDecimal(orderItem.getPrice() / 100.0f)
                       .multiply(exchangeRate).setScale(2, BigDecimal.ROUND_DOWN).floatValue();
               comOneItem.setUnitPrice(unitPrice.toString());
               comOneItemList.add(comOneItem);
               BigDecimal itemWeight = new BigDecimal("0.1");
               packageWeight.add(itemWeight);
           }
           ComOneConsignee consignee = new ComOneConsignee();
           consignee.setName(orderDelivery.getName());
           consignee.setCompany(orderDelivery.getName());
           String phone = orderDelivery.getMobile();
           consignee.setPhone(phone);
           consignee.setAddress(orderDelivery.getAddress());
           consignee.setPostcode(orderDelivery.getPostCode());
           consignee.setCity(orderDelivery.getCity());
           consignee.setState(orderDelivery.getProvince());
           // 渠道
           String channelId = "1482";
           request.setCountry(countryCode);
           request.setChannelId(channelId);
           request.setOrderNo(orderPushInfo.getOrder().getTid());
           request.setCount(String.valueOf(1));
           request.setWeight(packageWeight.setScale(2, BigDecimal.ROUND_HALF_UP).toString());
           request.setItemList(comOneItemList);
           request.setConsignee(consignee);
           return MyResult.ok(request);
       } catch (Exception e) {
           log.error("转换异常", e);
           return MyResult.build(400, "转换异常", null);
       }
    }
}
