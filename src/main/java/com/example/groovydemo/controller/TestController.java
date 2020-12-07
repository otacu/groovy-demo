package com.example.groovydemo.controller;

import com.example.groovydemo.pojo.common.*;
import com.example.groovydemo.pojo.request.MyComoneCreateOrderRequest;
import com.example.groovydemo.third.push.ComoneOrderPush;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Base64Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class TestController {

    @Autowired
    private ComoneOrderPush comoneOrderPush;

    @RequestMapping(value = "/comone/createOrder", method = RequestMethod.POST)
    @ResponseBody
    public MyResult comoneCreateOrder(@RequestBody MyComoneCreateOrderRequest request) {
        try {
            String decodeStr = new String(java.util.Base64.getDecoder().decode(request.getConvertScript()));
            MyOrderPushInfo orderPushInfo = this.queryOrderPushInfo();
            return comoneOrderPush.pushOrder(orderPushInfo, request.getUseScript(), decodeStr);
        } catch (Exception e) {
            log.error("创建商壹订单异常", e);
            return MyResult.fail("创建商壹订单异常");
        }
    }

    private MyOrderPushInfo queryOrderPushInfo() {
        MyOrderInfo order = new MyOrderInfo();
        order.setOrderNo("CF2019082100876690383");
        order.setTid("CF2019082100876690383R100638");
        order.setOrderNoForPush("CF2019082100876690383R100638");
        order.setConsignerName("发货人姓名");
        order.setConsignerPhone("12345678");
        MyOrderDeliveryInfo orderDelivery = new MyOrderDeliveryInfo();
        orderDelivery.setName("Mr Chan");
        orderDelivery.setAddress("000, Jalan Kastam,Pelabuhan Klang,42000,Selangor,Malaysia");
        orderDelivery.setCountry("Malaysia");
        orderDelivery.setMobile("34567890");
        orderDelivery.setPostCode("81000");
        orderDelivery.setProvince("Selangor");
        orderDelivery.setCity("Pelabuhan Klang");
        orderDelivery.setDistrict("Jalan Kastam");
        MyOrderPayInfo orderPay = new MyOrderPayInfo();

        List<MyOrderItemInfo> orderItemList = new ArrayList<>();
        MyOrderItemInfo orderItemInfo = new MyOrderItemInfo();
        orderItemInfo.setItemNo("5053i5362110553");
        orderItemInfo.setSkuName("月饼");
        orderItemInfo.setBarcode("barcode1");
        orderItemInfo.setNum(1);
        orderItemInfo.setDeclarePrice(20000);
        orderItemInfo.setPrice(20000);
        orderItemInfo.setTax(300);
        orderItemList.add(orderItemInfo);
        MyOrderPushInfo orderPushInfo = new MyOrderPushInfo();
        orderPushInfo.setOrder(order);
        orderPushInfo.setOrderDelivery(orderDelivery);
        orderPushInfo.setOrderPay(orderPay);
        orderPushInfo.setOrderItemList(orderItemList);
        return orderPushInfo;
    }

    public static void main(String[] args) {
        String str="package com.example.groovydemo.third.convert;\n" +
                "import com.example.groovydemo.pojo.common.MyOrderDeliveryInfo;\n" +
                "import com.example.groovydemo.pojo.common.MyOrderItemInfo;\n" +
                "import com.example.groovydemo.pojo.common.MyOrderPushInfo;\n" +
                "import com.example.groovydemo.pojo.common.MyResult;\n" +
                "import com.example.groovydemo.pojo.comone.ComOneConsignee;\n" +
                "import com.example.groovydemo.pojo.comone.ComOneCreateOrderRequest;\n" +
                "import com.example.groovydemo.pojo.comone.ComOneItem;\n" +
                "\n" +
                "import java.math.BigDecimal;\n" +
                "import java.util.ArrayList;\n" +
                "import java.util.List;\n" +
                "\n" +
                "class ConvertComoneCreateOrder {\n" +
                "    public MyResult convert(MyOrderPushInfo orderPushInfo) {\n" +
                "       try {\n" +
                "           ComOneCreateOrderRequest request = new ComOneCreateOrderRequest();\n" +
                "           MyOrderDeliveryInfo orderDelivery = orderPushInfo.getOrderDelivery();\n" +
                "           String postCode = orderDelivery.getPostCode();\n" +
                "           // 国家\n" +
                "           String countryCode = \"MY\";\n" +
                "           List<ComOneItem> comOneItemList = new ArrayList<>();\n" +
                "           List<MyOrderItemInfo> orderItemList = orderPushInfo.getOrderItemList();\n" +
                "           Boolean isCharge = false;\n" +
                "           Boolean isSeaShipping = false;\n" +
                "           BigDecimal exchangeRate = BigDecimal.ONE;\n" +
                "           BigDecimal packageWeight = BigDecimal.ZERO;\n" +
                "           for (MyOrderItemInfo orderItem : orderItemList) {\n" +
                "               ComOneItem comOneItem = new ComOneItem();\n" +
                "               comOneItem.setCname(orderItem.getSkuName());\n" +
                "               comOneItem.setName(orderItem.getSkuName());\n" +
                "               comOneItem.setNumber(String.valueOf(orderItem.getNum()));\n" +
                "               Float unitPrice = new BigDecimal(orderItem.getPrice() / 100.0f)\n" +
                "                       .multiply(exchangeRate).setScale(2, BigDecimal.ROUND_DOWN).floatValue();\n" +
                "               comOneItem.setUnitPrice(unitPrice.toString());\n" +
                "               comOneItemList.add(comOneItem);\n" +
                "               BigDecimal itemWeight = new BigDecimal(\"0.1\");\n" +
                "               packageWeight.add(itemWeight);\n" +
                "           }\n" +
                "           ComOneConsignee consignee = new ComOneConsignee();\n" +
                "           consignee.setName(orderDelivery.getName());\n" +
                "           consignee.setCompany(orderDelivery.getName());\n" +
                "           String phone = orderDelivery.getMobile();\n" +
                "           consignee.setPhone(phone);\n" +
                "           consignee.setAddress(orderDelivery.getAddress());\n" +
                "           consignee.setPostcode(orderDelivery.getPostCode());\n" +
                "           consignee.setCity(orderDelivery.getCity());\n" +
                "           consignee.setState(orderDelivery.getProvince());\n" +
                "           // 渠道\n" +
                "           String channelId = \"1234\";\n" +
                "           request.setCountry(countryCode);\n" +
                "           request.setChannelId(channelId);\n" +
                "           request.setOrderNo(orderPushInfo.getOrder().getTid());\n" +
                "           request.setCount(String.valueOf(1));\n" +
                "           request.setWeight(packageWeight.setScale(2, BigDecimal.ROUND_HALF_UP).toString());\n" +
                "           request.setItemList(comOneItemList);\n" +
                "           request.setConsignee(consignee);\n" +
                "           return MyResult.ok(request);\n" +
                "       } catch (Exception e) {\n" +
                "           return MyResult.build(400, \"转换异常\", null);\n" +
                "       }\n" +
                "    }\n" +
                "}";
        System.out.println(Base64Util.encode(str));
        String decodeStr = new String(java.util.Base64.getDecoder().decode(Base64Util.encode(str)));
        System.out.println(decodeStr);
    }
}
