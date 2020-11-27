package com.zpc.springcloud.controller;

import com.zpc.springcloud.dto.CommetResult;
import com.zpc.springcloud.pojo.Payment;
import com.zpc.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ClassName: PaymentController
 * Package: com.zpc.springcloud.controller
 * Description:
 *
 * @Date: 2020/11/27 16:52
 * @Author:zpc@qq.com
 */
@Slf4j
@RestController
public class PaymentController {


    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommetResult create(Payment payment){

        int result = paymentService.create(payment);
        log.info("=====进入创建=====");
        if (result>0){
            return new CommetResult(200, "创建成功",result);
        }else {
            return new CommetResult(444, "创建失败",result);
        }
    }
    @GetMapping("/payment/query/{id}")
    public CommetResult queryById(@PathVariable("id") Long id){
        log.info("=====进入查询=====");
        Payment result = paymentService.getPaymentById(id);
        if (result != null){
            return new CommetResult(200, "查询成功",result);
        }else {
            return new CommetResult(444, "查询失败",result);
        }
    }
}
