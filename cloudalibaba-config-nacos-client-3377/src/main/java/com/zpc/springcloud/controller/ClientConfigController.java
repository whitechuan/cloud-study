package com.zpc.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: ClientConfigController
 * Package: com.zpc.springcloud.controller
 * Description:
 *
 * @Date: 2020/12/4 10:50
 * @Author:zpc@qq.com
 */
@RestController
@RefreshScope
public class ClientConfigController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo()
    {
        return configInfo;
    }
}
