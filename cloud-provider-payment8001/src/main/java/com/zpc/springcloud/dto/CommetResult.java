package com.zpc.springcloud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName: CommetResult
 * Package: com.zpc.springcloud.dto
 * Description:
 *
 * @Date: 2020/11/27 16:33
 * @Author:zpc@qq.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommetResult<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;

    public CommetResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
