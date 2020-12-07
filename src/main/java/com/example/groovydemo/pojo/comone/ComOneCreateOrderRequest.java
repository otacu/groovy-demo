package com.example.groovydemo.pojo.comone;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 创建运单请求
 */
@Data
public class ComOneCreateOrderRequest implements Serializable {

    /**
     * 身份验证返回的resultid
     */
    @JSONField(name = "resultid")
    private String resultId;

    /**
     * 用户ID
     */
    @JSONField(name = "userid")
    private String userId;

    /**
     * 收件国家二字代码, 必填
     * Destination country ISO code,But east Malaysia is MY1 and west Malaysia is MY2
     */
    @JSONField(name = "country")
    private String country;

    /**
     * 渠道ID，必填
     */
    @JSONField(name = "channel_id")
    private String channelId;

    /**
     * 转单号 不填
     */
    @JSONField(name = "transferNum")
    private String transferNum;

    /**
     * 订单号
     */
    @JSONField(name = "ordernum")
    private String orderNo;

    /**
     * 件数，必填
     * Package number
     */
    @JSONField(name = "count")
    private String count;

    /**
     * 重量，必填
     * Package weight
     */
    @JSONField(name = "weight")
    private String weight;

    /**
     * Note
     */
    @JSONField(name = "remark")
    private String remark;

    /**
     * C.O.D amount
     */
    @JSONField(name = "cod")
    private String cod;

    /**
     * 货币类型，默认RMB
     * amount Currency type
     */
    @JSONField(name = "currencytype")
    private String currencyType;

    /**
     * size
     */
    @JSONField(name = "size")
    private ComOneGoodsSize size;

    /**
     * Goods description
     */
    @JSONField(name = "items")
    private List<ComOneItem> itemList;

    /**
     * Recipient information
     */
    @JSONField(name = "consignee")
    private ComOneConsignee consignee;

    /**
     * Shipper information
     */
    @JSONField(name = "shipper")
    private ComOneShipper shipper;

}
