package com.zpc.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zpc.springcloud.dto.CommetResult;
import com.zpc.springcloud.handle.BlockHandler;
import com.zpc.springcloud.pojo.Payment;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName: RateLimitController
 * Package: com.zpc.springcloud.controller
 * Description:
 *
 * @Date: 2020/12/9 9:43
 * @Author:zpc@qq.com
 */
public class RateLimitController {
    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handleException")
    public CommetResult byResource()
    {
        return new CommetResult(200,"按资源名称限流测试OK",new Payment(2020L,"serial001"));
    }
    public CommetResult handleException(BlockException exception)
    {
        return new CommetResult(444,exception.getClass().getCanonicalName()+"\t 服务不可用");
    }

    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public CommetResult byUrl()
    {
        return new CommetResult(200,"按url限流测试OK",new Payment(2020L,"serial002"));
    }


    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = BlockHandler.class,
            blockHandler = "handlerException2")
    public CommetResult customerBlockHandler()
    {
        return new CommetResult(200,"按客戶自定义",new Payment(2020L,"serial003"));
    }
}
