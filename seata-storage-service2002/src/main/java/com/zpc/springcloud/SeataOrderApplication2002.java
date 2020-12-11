package com.zpc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName: SeataOrderApplication2001
 * Package: com.zpc.springcloud
 * Description:
 *
 * @Date: 2020/12/11 13:48
 * @Author:zpc@qq.com
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients
public class SeataOrderApplication2002 {
    public static void main(String[] args) {
        SpringApplication.run(SeataOrderApplication2002.class, args);
    }
}
