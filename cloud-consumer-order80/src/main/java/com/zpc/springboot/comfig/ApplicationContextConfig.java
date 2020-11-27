package com.zpc.springboot.comfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: ApplicationContextConfig
 * Package: com.zpc.springboot.comfig
 * Description:
 *
 * @Date: 2020/11/27 19:32
 * @Author:zpc@qq.com
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
