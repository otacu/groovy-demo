package com.example.groovydemo.third.push;

import com.example.groovydemo.pojo.common.MyOrderPushInfo;
import com.example.groovydemo.pojo.common.MyResult;
import com.example.groovydemo.pojo.comone.ComOneCreateOrderRequest;
import com.example.groovydemo.third.basic.ComoneService;
import com.example.groovydemo.third.convert.ConvertComoneCreateOrder;
import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 商壹推单
 */
@Slf4j
@Component
public class ComoneOrderPush implements PushOrderInterface {

    @Autowired
    private ConvertComoneCreateOrder convertComoneCreateOrder;

    @Autowired
    private ComoneService comoneService;

    /**
     *
     * @param orderPushInfo 推单信息
     * @param useScript 是否使用脚本将数据转换成请求
     * @param convertScript 转换脚本
     * @return
     */
    @Override
    public MyResult pushOrder(MyOrderPushInfo orderPushInfo, Boolean useScript, String convertScript) {
        try {
            ComOneCreateOrderRequest request = null;
            MyResult convertResult = null;
            if (useScript) {
                convertResult = this.convertWithScript(orderPushInfo, convertScript);
            } else {
                convertResult = convertComoneCreateOrder.convert(orderPushInfo);
            }
            if (MyResult.isNotOk(convertResult)) {
                return convertResult;
            }
            request = (ComOneCreateOrderRequest) convertResult.getData();

            MyResult createOrderResult = comoneService.createOrder(request);
            if (MyResult.isOk(createOrderResult)) {

            } else {

            }
            return createOrderResult;
        } catch (Exception e) {
            log.error("推送ComOne物流未知异常", e);
            return MyResult.fail("推送ComOne物流未知异常");
        } finally {
            // 插入推单记录
            // 删除和插入失败记录
            // 成功的话保存物流信息
        }
    }

    private MyResult convertWithScript(MyOrderPushInfo orderPushInfo, String convertScript) {
        try {
            GroovyClassLoader groovyClassLoader = new GroovyClassLoader();
            Class aClass = groovyClassLoader.parseClass(convertScript);
            GroovyObject groovyObject = (GroovyObject) aClass.newInstance();
            return (MyResult) groovyObject.invokeMethod("convert", orderPushInfo);
        } catch (Exception e) {
            log.error("用脚本转换商壹创建订单请求异常", e);
            return MyResult.fail("用脚本转换商壹创建订单请求异常");
        }
    }
}
