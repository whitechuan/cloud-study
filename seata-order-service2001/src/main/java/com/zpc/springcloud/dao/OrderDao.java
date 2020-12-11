package com.zpc.springcloud.dao;

import com.zpc.springcloud.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: OrderDao
 * Package: com.zpc.springcloud.dao
 * Description:
 *
 * @Date: 2020/12/11 13:57
 * @Author:zpc@qq.com
 */
@Mapper
public interface OrderDao {
    /**
     * 创建订单
     * @param order
     */
    void create(Order order);

    /**
     * 修改订单状态 ，从0改到1
     * @param userId
     * @param status
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
