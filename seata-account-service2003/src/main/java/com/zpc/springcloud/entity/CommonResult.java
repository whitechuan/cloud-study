package com.zpc.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: CommonResult
 * Package: com.zpc.springcloud.entity
 * Description:
 *
 * @Date: 2020/12/11 13:55
 * @Author:zpc@qq.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String  message;
    private T       data;

    public CommonResult(Integer code, String message)
    {
        this(code,message,null);
    }
}
