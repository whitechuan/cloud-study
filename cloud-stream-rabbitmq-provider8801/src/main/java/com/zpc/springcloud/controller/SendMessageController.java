package com.zpc.springcloud.controller;

import com.zpc.springcloud.service.IMessageProvider;
import com.zpc.springcloud.service.impl.MessageProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Recover;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: SendMessageController
 * Package: com.zpc.springcloud.controller
 * Description:
 *
 * @Date: 2020/12/3 9:53
 * @Author:zpc@qq.com
 */
@RestController
public class SendMessageController {

    @Autowired
    IMessageProvider iMessageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage(){
        return iMessageProvider.send();
    }

}
