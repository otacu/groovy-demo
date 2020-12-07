
package com.example.groovydemo.pojo.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class MyOrderItemInfo implements Serializable {

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * skuId
     */
    private Long skuId;

    /**
     * spuId = itemIdxCode
     */
    private Long spuId;

    /**
     * 货号
     */
    private String itemNo;


    /**
     * 条码
     */
    private String barcode;

    /**
     * 货品SKU名称
     */
    private String skuName;

    /**
     * 货品数量
     */
    private Integer num;

    /**
     * 商品单价(分)
     */
    private Integer price;

    /**
     * 商品单价
     */
    private String priceDots2;

    /**
     * 商品申报价
     */
    private Integer declarePrice;

    /**
     * 商品申报价
     */
    private String declarePriceDots2;

    /**
     * 税费
     */
    private Integer tax;

    /**
     * 税费
     */
    private String taxDots2;

    /**
     *  下单总折扣(分)
     */
    private Integer discountFee;

    /**
     *  下单总折扣
     */
    private String discountFeeDots2;
}
