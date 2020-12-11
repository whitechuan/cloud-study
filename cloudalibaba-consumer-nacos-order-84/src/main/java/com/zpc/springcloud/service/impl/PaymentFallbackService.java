package com.zpc.springcloud.service.impl;

import com.zpc.springcloud.dto.CommetResult;
import com.zpc.springcloud.pojo.Payment;
import com.zpc.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * ClassName: PaymentServiceImpl
 * Package: com.zpc.springcloud.service.impl
 * Description:
 *
 * @Date: 2020/12/11 12:22
 * @Author:zpc@qq.com
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommetResult<Payment> paymentSQL(Long id) {
        return new CommetResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
