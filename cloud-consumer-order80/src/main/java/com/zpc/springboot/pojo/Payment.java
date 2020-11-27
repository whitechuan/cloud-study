package com.zpc.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Payment
 * Package: com.zpc.springcloud.pojo
 * Description:
 *
 * @Date: 2020/11/27 16:32
 * @Author:zpc@qq.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long id;
    private String orderStatus;
}
