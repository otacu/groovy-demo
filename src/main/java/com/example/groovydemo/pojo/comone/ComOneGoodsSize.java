package com.example.groovydemo.pojo.comone;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;

/**
 * 包裹大小
 */
@Data
public class ComOneGoodsSize implements Serializable {
    /**
     * The length, the unit is cm
     */
    @JSONField(name = "long")
    private String longth;

    /**
     * The width, the unit is cm
     */
    @JSONField(name = "width")
    private String width;

    /**
     * The heigth, the unit is cm
     */
    @JSONField(name = "heigth")
    private String heigth;

    /**
     * Quantities,must be integers
     */
    @JSONField(name = "count")
    private String count;

}
