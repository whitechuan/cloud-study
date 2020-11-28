package com.zpc.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * ClassName: PaymentController
 * Package: com.zpc.springcloud.controller
 * Description:
 *
 * @Date: 2020/11/28 11:01
 * @Author:zpc@qq.com
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/zk")
    public String paymentZK(){
        return "springcloud with zookeeper serverport:"+port+"\t"+ UUID.randomUUID().toString();
    }
}
