package com.example.groovydemo.pojo.common;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 推单要用到的全部参数都放进这个类
 */
@Data
public class MyOrderPushInfo implements Serializable {

    /**
     * 订单信息对象
     */
    private MyOrderInfo order;

    /**
     * 订单配送信息
     */
    private MyOrderDeliveryInfo orderDelivery;

    /**
     * 支付信息
     */
    private MyOrderPayInfo orderPay;

    /**
     * 订单商品信息
     */
    private List<MyOrderItemInfo> orderItemList;
}
