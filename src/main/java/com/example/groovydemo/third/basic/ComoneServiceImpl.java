package com.example.groovydemo.third.basic;

import com.alibaba.fastjson.JSON;
import com.example.groovydemo.pojo.common.MyResult;
import com.example.groovydemo.pojo.comone.ComOneCreateOrderRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ComoneServiceImpl implements ComoneService {
    /**
     * 创建运单
     *
     * @param request 请求对象
     * @return 请求结果
     */
    @Override
    public MyResult createOrder(ComOneCreateOrderRequest request) {
        log.info(JSON.toJSONString(request));
        return null;
    }

    /**
     * 查询物流轨迹
     *
     * @param logisticsNo 物流单号
     * @return 请求结果
     */
    @Override
    public MyResult getTrackDetails(String logisticsNo) {
        return null;
    }

    /**
     * 获取面单url
     *
     * @param logisticsNo 物流单号
     * @return 结果
     */
    @Override
    public MyResult getLabelUrl(String logisticsNo) {
        return null;
    }
}
