package com.zpc.springcloud.service;

import com.zpc.springcloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName: StorageService
 * Package: com.zpc.springcloud.service
 * Description:
 *
 * @Date: 2020/12/11 14:00
 * @Author:zpc@qq.com
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}

