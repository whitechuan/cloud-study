package com.zpc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: OrderMainZK80
 * Package: com.zpc.springcloud
 * Description:
 *
 * @Date: 2020/11/28 18:45
 * @Author:zpc@qq.com
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMainZK80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMainZK80.class,args);
    }
}
