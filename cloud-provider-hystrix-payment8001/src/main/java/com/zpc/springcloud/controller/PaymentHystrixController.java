package com.zpc.springcloud.controller;

import cn.hutool.core.util.IdUtil;
import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zpc.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: PaymentHystrixController
 * Package: com.zpc.springcloud.controller
 * Description:
 *
 * @Date: 2020/11/29 19:35
 * @Author:zpc@qq.com
 */
@RestController
@Slf4j
public class PaymentHystrixController {

    @Value("${server.port}")
    private String port;
    @Autowired
    PaymentHystrixService paymentHystrixService;
    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        String result = paymentHystrixService.hystrixOk(id);
        log.info("*****result:" + result);
        return result;
    }

    /**
     * 超时访问
     *
     * @param id
     * @return
     */
    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        String result = paymentHystrixService.hystrixTimeout(id);
        log.info("*****result:" + result);
        return result;

    }

    @GetMapping("/payment/circuit/{id}")
    public String paymentInfo_circuit(@PathVariable("id") Integer id){
        String result = paymentHystrixService.paymentCircuitBreaker(id);
        log.info("*****result:" + result);
        return result;
    }


}
