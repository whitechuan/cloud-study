package com.zpc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.awt.geom.GeneralPath;

/**
 * ClassName: GateWay9527
 * Package: com.zpc.springcloud
 * Description:
 *
 * @Date: 2020/11/30 11:31
 * @Author:zpc@qq.com
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWay9527 {
    public static void main(String[] args) {
        SpringApplication.run(GateWay9527.class, args);
    }
}
