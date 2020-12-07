package com.example.groovydemo.third.push;

import com.example.groovydemo.pojo.common.MyResult;
import com.example.groovydemo.pojo.common.MyOrderPushInfo;

/**
 * 推单接口
 */
public interface PushOrderInterface {
    /**
     *
     * @param orderPushInfo 推单信息
     * @param useScript 是否使用脚本将数据转换成请求
     * @param convertScript 转换脚本
     * @return
     */
    MyResult pushOrder(MyOrderPushInfo orderPushInfo, Boolean useScript, String convertScript);
}
