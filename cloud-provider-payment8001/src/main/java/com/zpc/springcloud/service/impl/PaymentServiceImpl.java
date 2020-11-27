package com.zpc.springcloud.service.impl;

import com.zpc.springcloud.dao.PaymentMapper;
import com.zpc.springcloud.pojo.Payment;
import com.zpc.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jws.Oneway;

/**
 * ClassName: PaymentServiceImpl
 * Package: com.zpc.springcloud.service.impl
 * Description:
 *
 * @Date: 2020/11/27 16:47
 * @Author:zpc@qq.com
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
