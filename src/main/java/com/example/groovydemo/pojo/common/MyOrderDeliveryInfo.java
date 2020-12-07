package com.example.groovydemo.pojo.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class MyOrderDeliveryInfo implements Serializable {

    /**
     * 收货人名称
     */
    private String name;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 订购人姓名，与证件号码对应
     */
    private String buyerName;

    /**
     * 订购人证件号码
     */
    private String buyerCardNo;

    /**
     * 订购人电话
     */
    private String buyerPhone;

    /**
     * 证件正面
     */
    private String cardFrontImg;
    /**
     * 证件背面
     */
    private String cardBackImg;


    /**
     * 邮政编码
     */
    private String postCode;

    /**
     * 国家
     */
    private String country;

    /**
     * 省份
     */
    private String province;

    /**
     * 省份编码
     */
    private String provinceCode;

    /**
     * 城市
     */
    private String city;

    /**
     * 区县
     */
    private String district;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 物流公司编码
     */
    private String logisticsCode;

    /**
     *  物流单号
     */
    private String logisticsNo;


    /**
     * 国际物流公司编码
     */
    private String internationalLogisticsCode;

    /**
     *  国际物流单号
     */
    private String internationalLogisticsNo;

    /**
     *  国际物流面单地址
     */
    private String internationalLogisticsUrl;
}
