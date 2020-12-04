package com.zpc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: OrderNacosMain83
 * Package: com.zpc.springcloud
 * Description:
 *
 * @Date: 2020/12/4 10:26
 * @Author:zpc@qq.com
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain83 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain83.class, args);
    }
}
