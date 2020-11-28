package com.zpc.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: OrderConsulController
 * Package: com.zpc.springcloud.controller
 * Description:
 *
 * @Date: 2020/11/28 20:18
 * @Author:zpc@qq.com
 */
@RestController
@Slf4j
public class OrderConsulController {

    private static final String INVOX_URI = "http://cloud-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String payinfo(){
        String result = restTemplate.getForObject(INVOX_URI + "/payment/consul", String.class);
        return result;
    }

}
