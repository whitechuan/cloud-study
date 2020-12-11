package com.zpc.springcloud.controller;

import com.zpc.springcloud.entity.CommonResult;
import com.zpc.springcloud.entity.Order;
import com.zpc.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ClassName: OrderController
 * Package: com.zpc.springcloud.controller
 * Description:
 *
 * @Date: 2020/12/11 14:03
 * @Author:zpc@qq.com
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
