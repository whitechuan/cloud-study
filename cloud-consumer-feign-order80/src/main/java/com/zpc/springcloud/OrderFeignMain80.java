package com.zpc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName: OrderFeignMain80
 * Package: com.zpc.springcloud
 * Description:
 *
 * @Date: 2020/11/29 17:31
 * @Author:zpc@qq.com
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class,args);
    }
}
