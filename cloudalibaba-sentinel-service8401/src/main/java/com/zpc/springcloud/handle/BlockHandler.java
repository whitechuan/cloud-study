package com.zpc.springcloud.handle;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zpc.springcloud.dto.CommetResult;

/**
 * ClassName: BlockHandler
 * Package: com.zpc.springcloud.handle
 * Description:
 *
 * @Date: 2020/12/9 9:43
 * @Author:zpc@qq.com
 */
public class BlockHandler {
    public static CommetResult handlerException(BlockException exception)
    {
        return new CommetResult(4444,"按客戶自定义,global handlerException----1");
    }
    public static CommetResult handlerException2(BlockException exception)
    {
        return new CommetResult(4444,"按客戶自定义,global handlerException----2");
    }
}
