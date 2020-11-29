package com.zpc.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: MySelfRule
 * Package: com.zpc.myrule
 * Description:
 *
 * @Date: 2020/11/29 16:11
 * @Author:zpc@qq.com
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }

}
