package com.example.groovydemo.third.basic;

import com.example.groovydemo.pojo.common.MyResult;
import com.example.groovydemo.pojo.comone.ComOneCreateOrderRequest;

public interface ComoneService {
    /**
     * 创建运单
     *
     * @param request 请求对象
     * @return 请求结果
     */
    MyResult createOrder(ComOneCreateOrderRequest request);

    /**
     * 查询物流轨迹
     *
     * @param logisticsNo 物流单号
     * @return 请求结果
     */
    MyResult getTrackDetails(String logisticsNo);

    /**
     * 获取面单url
     *
     * @param logisticsNo 物流单号
     * @return 结果
     */
    MyResult getLabelUrl(String logisticsNo);
}
