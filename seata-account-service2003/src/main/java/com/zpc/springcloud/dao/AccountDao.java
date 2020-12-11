package com.zpc.springcloud.dao;

import com.zpc.springcloud.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * ClassName: AccountDao
 * Package: com.zpc.springcloud.dao
 * Description:
 *
 * @Date: 2020/12/11 13:57
 * @Author:zpc@qq.com
 */
@Mapper
public interface AccountDao {

    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
