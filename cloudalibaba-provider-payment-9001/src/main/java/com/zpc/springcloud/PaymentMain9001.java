package com.zpc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: PaymentMain9001
 * Package: com.zpc.springcloud
 * Description:
 *
 * @Date: 2020/12/4 10:04
 * @Author:zpc@qq.com
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9001.class, args);
    }
}
