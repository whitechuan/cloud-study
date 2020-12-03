package com.zpc.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Controller;

/**
 * ClassName: ReceiveMessageListenerController
 * Package: com.zpc.springcloud.controller
 * Description:
 *
 * @Date: 2020/12/3 10:13
 * @Author:zpc@qq.com
 */
@Controller
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("消费者二号=================接收的信息："+message.getPayload()+"\t"
                +"serverport:"+serverPort);
    }

}
