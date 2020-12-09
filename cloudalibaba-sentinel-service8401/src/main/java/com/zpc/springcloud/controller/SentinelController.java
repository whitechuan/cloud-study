package com.zpc.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

/**
 * ClassName: SentinelController
 * Package: com.zpc.springcloud.controller
 * Description:
 *
 * @Date: 2020/12/7 9:53
 * @Author:zpc@qq.com
 */
@RestController
@Slf4j
public class SentinelController {

    @GetMapping("/getA")
    public String getA(){
        return "========>A";
    }

    @GetMapping("/getB")
    public String getB(){
        return "=========>B";
    }



}
