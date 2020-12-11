package com.zpc.springcloud.service;

import com.zpc.springcloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * ClassName: AccountService
 * Package: com.zpc.springcloud.service
 * Description:
 *
 * @Date: 2020/12/11 13:59
 * @Author:zpc@qq.com
 */
public interface AccountService {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
