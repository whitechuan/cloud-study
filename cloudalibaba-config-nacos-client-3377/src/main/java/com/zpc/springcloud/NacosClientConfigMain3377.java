package com.zpc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: NacosClientConfigMain3377
 * Package: com.zpc.springcloud
 * Description:
 *
 * @Date: 2020/12/4 10:48
 * @Author:zpc@qq.com
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosClientConfigMain3377 {
    public static void main(String[] args) {
        SpringApplication.run(NacosClientConfigMain3377.class, args);
    }
}
