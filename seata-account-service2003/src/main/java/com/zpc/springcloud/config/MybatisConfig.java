package com.zpc.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: MybatisConfig
 * Package: com.zpc.springcloud.config
 * Description:
 *
 * @Date: 2020/12/11 13:54
 * @Author:zpc@qq.com
 */
@Configuration
@MapperScan("com.zpc.springcloud.dao")
public class MybatisConfig {

}
