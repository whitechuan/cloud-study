package com.zpc.springcloud.service;

import com.zpc.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: PaymentService
 * Package: com.zpc.springcloud.service
 * Description:
 *
 * @Date: 2020/11/27 16:47
 * @Author:zpc@qq.com
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
