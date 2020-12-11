package com.zpc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: PaymentApplication9004
 * Package: com.zpc.springcloud
 * Description:
 *
 * @Date: 2020/12/11 12:11
 * @Author:zpc@qq.com
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication9004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication9004.class, args);
    }
}
