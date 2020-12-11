package com.zpc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName: OrderNacosApplication84
 * Package: com.zpc.springcloud
 * Description:
 *
 * @Date: 2020/12/11 12:19
 * @Author:zpc@qq.com
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderNacosApplication84 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosApplication84.class, args);
    }
}
