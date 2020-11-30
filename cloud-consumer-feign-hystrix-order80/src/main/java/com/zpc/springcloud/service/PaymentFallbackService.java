package com.zpc.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * ClassName: PaymentFallbackService
 * Package: com.zpc.springcloud.service
 * Description:
 *
 * @Date: 2020/11/30 9:48
 * @Author:zpc@qq.com
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "=====paymentservice foallback paymentInfo_OK o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "=====paymentservice foallback paymentInfo_TimeOut o(╥﹏╥)o";
    }
}
