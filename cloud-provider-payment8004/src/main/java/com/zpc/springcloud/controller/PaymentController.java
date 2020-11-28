package com.zpc.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * ClassName: PaymentController
 * Package: com.zpc.springcloud.controller
 * Description:
 *
 * @Date: 2020/11/28 20:01
 * @Author:zpc@qq.com
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/consul")
    public String paymentConsul(){
        return "springcloud with consul serverport:"+port+"\t"+ UUID.randomUUID().toString();
    }
}
