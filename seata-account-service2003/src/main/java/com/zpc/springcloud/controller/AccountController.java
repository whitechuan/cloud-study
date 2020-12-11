package com.zpc.springcloud.controller;

import com.zpc.springcloud.entity.CommonResult;
import com.zpc.springcloud.entity.Account;
import com.zpc.springcloud.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * ClassName: OrderController
 * Package: com.zpc.springcloud.controller
 * Description:
 *
 * @Date: 2020/12/11 14:03
 * @Author:zpc@qq.com
 */
@RestController
public class AccountController {

    @Resource
    AccountService accountService;

    /**
     * 扣减账户余额
     */
    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money){
        accountService.decrease(userId,money);
        return new CommonResult(200,"扣减账户余额成功！");
    }
}
