package com.zpc.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.jws.Oneway;

/**
 * ClassName: OrderNacosController
 * Package: com.zpc.springcloud.controller
 * Description:
 *
 * @Date: 2020/12/4 10:27
 * @Author:zpc@qq.com
 */
@RestController
@Slf4j
public class OrderNacosController {

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(serverURL+"/payment/nacos/"+id,String.class);
    }
}
