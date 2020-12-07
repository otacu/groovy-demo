
package com.example.groovydemo.pojo.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class MyOrderInfo implements Serializable {

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 外部平台订单号
     */
    private String tid;

    /**
     * 推单用的订单号
     */
    private String orderNoForPush;

    /**
     * 仓库编码
     */
    private String warehouseNo;

    /**
     * 订单来源(1:洋桃，2:C店)，不能为空，冗余字段方便查询
     */
    private Short orderSource;

    /**
     * 平台
     */
    private String platformCode;

    /**
     * 店铺编码
     */
    private String shopNo;

    /**
     * 商品类型：10：海外, 20：贩外
     */
    private Short itemType;

    /**
     * ccTax
     */
    private Integer ccTax;

    /**
     * 客户网名 例如易捷海购
     */
    private String nickName;

    /**
     * 发货人名字
     */
    private String consignerName;

    /**
     * 发货人电话
     */
    private String consignerPhone;

    /**
     * 生成分物流状态
     */
    private Short generateShuntFlowStatus;

    /**
     * 推wms状态
     */
    private Short pushWmsStatus;

    /**
     * 查询物流单号状态
     */
    private Short queryExpressNoStatus;

    /**
     * 订单总税费
     */
    private Integer tax;

    /**
     * 订单总税费
     */
    private String taxDots2;

    /**
     * 运费
     */
    private Integer freight;

    /**
     * 运费
     */
    private String freightDots2;

    /**
     * 优惠金额
     */
    private Integer discountFee;

    /**
     * 优惠金额
     */
    private String discountFeeDots2;

    /**
     * 订单总申报价
     */
    private Integer declarePrice;

    /**
     * 订单总申报价
     */
    private String declarePriceDots2;

    /**
     * 币种
     */
    private String currency;

    /**
     * oms货主编码
     */
    private String omsOwnerCode;

    /**
     * wms货主编码
     */
    private String wmsOwnerCode;
}
