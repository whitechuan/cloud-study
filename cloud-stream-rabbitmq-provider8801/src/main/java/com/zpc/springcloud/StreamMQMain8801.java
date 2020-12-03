package com.zpc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import sun.applet.Main;

/**
 * ClassName: StreamMQMain8801
 * Package: com.zpc.springcloud
 * Description:
 *
 * @Date: 2020/12/3 9:38
 * @Author:zpc@qq.com
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMQMain8801 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQMain8801.class, args);
    }
}
