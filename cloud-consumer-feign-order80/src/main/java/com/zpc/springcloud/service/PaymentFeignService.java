package com.zpc.springcloud.service;

import com.zpc.springcloud.dto.CommetResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * ClassName: PaymentFeignService
 * Package: com.zpc.springcloud.service
 * Description:
 *
 * @Date: 2020/11/29 17:33
 * @Author:zpc@qq.com
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping("/payment/query/{id}")
    CommetResult queryById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/timeout")
    String getPaymentTimeout();
}
