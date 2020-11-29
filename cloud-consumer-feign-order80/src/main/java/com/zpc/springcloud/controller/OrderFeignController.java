package com.zpc.springcloud.controller;

import com.zpc.springcloud.dto.CommetResult;
import com.zpc.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ClassName: OrderFeignController
 * Package: com.zpc.springcloud.controller
 * Description:
 *
 * @Date: 2020/11/29 17:37
 * @Author:zpc@qq.com
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/query/{id}")
    public CommetResult queryById(@PathVariable("id") Long id){
        return  paymentFeignService.queryById(id);
    }
}
