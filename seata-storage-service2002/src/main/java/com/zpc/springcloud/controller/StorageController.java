package com.zpc.springcloud.controller;

import com.zpc.springcloud.entity.CommonResult;
import com.zpc.springcloud.entity.Storage;
import com.zpc.springcloud.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ClassName: OrderController
 * Package: com.zpc.springcloud.controller
 * Description:
 *
 * @Date: 2020/12/11 14:03
 * @Author:zpc@qq.com
 */
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }
}
