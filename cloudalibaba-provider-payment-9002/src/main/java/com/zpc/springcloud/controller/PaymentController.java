package com.zpc.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: PaymentController
 * Package: com.zpc.springcloud
 * Description:
 *
 * @Date: 2020/12/4 10:05
 * @Author:zpc@qq.com
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/nacos/{id}")
    public String queryById(@PathVariable("id") Long id){
        return "nacos 服务发现，注册 服务端口："+serverPort+"\t"+"id="+id;
    }
}
