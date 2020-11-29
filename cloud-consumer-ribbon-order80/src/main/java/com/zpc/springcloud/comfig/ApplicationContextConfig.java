package com.zpc.springcloud.comfig;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: ApplicationContextConfig
 * Package: com.zpc.springcloud.comfig
 * Description:
 *
 * @Date: 2020/11/27 19:32
 * @Author:zpc@qq.com
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced  //添加RestTemplate的负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
