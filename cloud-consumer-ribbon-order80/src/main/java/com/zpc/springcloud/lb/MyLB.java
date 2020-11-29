package com.zpc.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * ClassName: MyLB
 * Package: com.zpc.springcloud.lb
 * Description:
 *
 * @Date: 2020/11/29 16:50
 * @Author:zpc@qq.com
 */
@Component
public class MyLB implements LoadBalancer {

    private  AtomicInteger atomicInteger = new AtomicInteger(0);


    private final int getAndIncrease(){
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;
        }while (!atomicInteger.compareAndSet(current, next));//
        return next;
    }

    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrease()%serviceInstances.size();
        return serviceInstances.get(index);
    }
}
