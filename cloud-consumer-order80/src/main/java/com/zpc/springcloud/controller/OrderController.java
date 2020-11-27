package com.zpc.springcloud.controller;

import com.zpc.springcloud.dto.CommetResult;
import com.zpc.springcloud.pojo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: OrderController
 * Package: com.zpc.springcloud.controller
 * Description:
 *
 * @Date: 2020/11/27 19:33
 * @Author:zpc@qq.com
 */
@RestController
public class OrderController {
    private final String PAYMENT_URI = "http://127.0.0.1:8001";

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/consumer/payment/create")
    public CommetResult create(Payment payment){

       return restTemplate.postForObject(PAYMENT_URI+"/payment/create", payment, CommetResult.class);
    }
    @GetMapping("/consumer/payment/query/{id}")
    public CommetResult queryById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URI+"/payment/query/"+id,  CommetResult.class);

    }

}
