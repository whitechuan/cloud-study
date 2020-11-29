package com.zpc.springcloud.controller;

import com.sun.media.jfxmedia.logging.Logger;
import com.zpc.springcloud.dto.CommetResult;
import com.zpc.springcloud.pojo.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
@Slf4j
public class OrderController {
    //private final String PAYMENT_URI = "http://127.0.0.1:8001";
    private final String PAYMENT_URI = "http://CLOUD-PAYMENT-SERVICE";
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

    @GetMapping("/consumer/payment/queryEntity/{id}")
    public CommetResult queryById2(@PathVariable("id") Long id){
        ResponseEntity<CommetResult> forEntity = restTemplate.getForEntity(PAYMENT_URI + "/payment/query/" + id, CommetResult.class);
            log.info("...========"+forEntity.getHeaders());
           if(forEntity.getStatusCode().is2xxSuccessful()){
               return forEntity.getBody();
           }else {
               return new CommetResult(444,"请求错误");
           }
    }

}
