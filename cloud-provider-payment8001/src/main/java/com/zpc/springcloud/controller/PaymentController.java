package com.zpc.springcloud.controller;

import com.zpc.springcloud.dto.CommetResult;
import com.zpc.springcloud.pojo.Payment;
import com.zpc.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * ClassName: PaymentController
 * Package: com.zpc.springcloud.controller
 * Description:
 *
 * @Date: 2020/11/27 16:52
 * @Author:zpc@qq.com
 */
@Slf4j
@RestController
public class PaymentController {

    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommetResult create(@RequestBody Payment payment){

        int result = paymentService.create(payment);
        log.info("=====进入创建=====");
        if (result>0){
            return new CommetResult(200, "创建成功,服务端口："+serverPort,result);
        }else {
            return new CommetResult(444, "创建失败,服务端口："+serverPort,result);
        }
    }
    @GetMapping("/payment/query/{id}")
    public CommetResult queryById(@PathVariable("id") Long id){
        log.info("=====进入查询=====");
        Payment result = paymentService.getPaymentById(id);
        if (result != null){
            return new CommetResult(200, "查询成功,服务端口："+serverPort,result);
        }else {
            return new CommetResult(444, "查询失败，服务端口："+serverPort,result);
        }
    }

    @GetMapping("/payment/discovery")
    public DiscoveryClient discovery(){
        Collection<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("##########"+service);
        }

        Collection<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info("**********"+instance.getHost()+"\t"+instance.getServiceId()+"\t"+instance.getPort());
        }
         return discoveryClient;
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }

}
