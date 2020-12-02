package com.zpc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName: ConfigMain3366
 * Package: com.zpc.springcloud
 * Description:
 *
 * @Date: 2020/12/2 10:19
 * @Author:zpc@qq.com
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigMain3366 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigMain3366.class,args);
    }
}
