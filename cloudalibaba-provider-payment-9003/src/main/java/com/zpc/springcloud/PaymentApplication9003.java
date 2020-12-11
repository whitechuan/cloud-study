package com.zpc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: PaymentApplication9003
 * Package: com.zpc.springcloud
 * Description:
 *
 * @Date: 2020/12/11 12:04
 * @Author:zpc@qq.com
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication9003 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication9003.class, args);
    }
}
