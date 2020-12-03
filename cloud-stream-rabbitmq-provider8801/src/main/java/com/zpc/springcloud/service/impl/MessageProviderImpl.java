package com.zpc.springcloud.service.impl;

import com.zpc.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import java.io.Serializable;
import java.util.UUID;

/**
 * ClassName: MessageProviderImpl
 * Package: com.zpc.springcloud.service.impl
 * Description:
 *
 * @Date: 2020/12/3 9:42
 * @Author:zpc@qq.com
 */
@EnableBinding(Source.class) //定义消息的推送管道
public class MessageProviderImpl implements IMessageProvider {

    @Autowired
    private MessageChannel output; //消息发送管道

    @Override
    public String send() {
        String uuid = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(uuid).build());
        System.out.println("========uuid="+uuid);
        return null;
    }
}
