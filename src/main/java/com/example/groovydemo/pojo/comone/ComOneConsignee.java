package com.example.groovydemo.pojo.comone;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;

/**
 * 收货人
 */
@Data
public class ComOneConsignee implements Serializable {

    /**
     * name
     */

    @JSONField(name = "name")
    private String name;

    /**
     * company
     */

    @JSONField(name = "company")
    private String company;

    /**
     * phone
     */

    @JSONField(name = "phone")
    private String phone;

    /**
     * address
     */

    @JSONField(name = "address")
    private String address;

    /**
     * postcode
     */

    @JSONField(name = "postcode")
    private String postcode;

    /**
     * email
     */
    @JSONField(name = "email")
    private String email;

    /**
     * state
     */
    @JSONField(name = "state")
    private String state;

    /**
     * city
     */
    @JSONField(name = "city")
    private String city;

}
