package com.example.groovydemo.pojo.comone;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;

/**
 * 商品
 */
@Data
public class ComOneItem implements Serializable {

    /**
     * Description of Chinese goods
     */
    
    @JSONField(name = "cname")
    private String cname;

    /**
     * Description of English goods
     */
    
    @JSONField(name = "name")
    private String name;

    /**
     * number
     */
    
    @JSONField(name = "number")
    private String number;

    /**
     * Declare the unit price
     */
    
    @JSONField(name = "unit_price")
    private String unitPrice;

}
