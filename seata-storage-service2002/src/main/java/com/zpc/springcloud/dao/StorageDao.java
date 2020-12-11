package com.zpc.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: StorageDao
 * Package: com.zpc.springcloud.dao
 * Description:
 *
 * @Date: 2020/12/11 13:57
 * @Author:zpc@qq.com
 */
@Mapper
public interface StorageDao {

    //扣减库存
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
