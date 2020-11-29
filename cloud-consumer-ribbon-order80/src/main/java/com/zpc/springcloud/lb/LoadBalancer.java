package com.zpc.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * ClassName: LoadBalancer
 * Package: com.zpc.springcloud.lb
 * Description:
 *
 * @Date: 2020/11/29 16:48
 * @Author:zpc@qq.com
 */
public interface LoadBalancer {

    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
