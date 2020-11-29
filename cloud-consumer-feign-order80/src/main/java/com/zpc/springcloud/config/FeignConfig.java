package com.zpc.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: FeignConfig
 * Package: com.zpc.springcloud.config
 * Description:
 *
 * @Date: 2020/11/29 18:56
 * @Author:zpc@qq.com
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
