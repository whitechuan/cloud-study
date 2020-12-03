package com.zpc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName: StreamReciveMain8802
 * Package: com.zpc.springcloud
 * Description:
 *
 * @Date: 2020/12/3 10:11
 * @Author:zpc@qq.com
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamReciveMain8803 {
    public static void main(String[] args) {
        SpringApplication.run(StreamReciveMain8803.class, args);
    }
}
