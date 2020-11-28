package com.zpc.springcloud.dao;

import com.zpc.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: PaymentMapper
 * Package: com.zpc.springcloud.dao
 * Description:
 *
 * @Date: 2020/11/27 16:36
 * @Author:zpc@qq.com
 */
@Mapper
public interface PaymentMapper {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
