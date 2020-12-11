package com.zpc.springcloud.service;

import com.zpc.springcloud.dto.CommetResult;
import com.zpc.springcloud.pojo.Payment;
import com.zpc.springcloud.service.impl.PaymentFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * ClassName: PaymentService
 * Package: com.zpc.springcloud.service
 * Description:
 *
 * @Date: 2020/12/11 12:21
 * @Author:zpc@qq.com
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService {
    @GetMapping(value = "/paymentSQL/{id}")
    public CommetResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
