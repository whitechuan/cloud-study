package com.zpc.springcloud.service.impl;

import com.zpc.springcloud.dao.StorageDao;
import com.zpc.springcloud.entity.Storage;
import com.zpc.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ClassName: OrderServiceImpl
 * Package: com.zpc.springcloud.service.impl
 * Description:
 *
 * @Date: 2020/12/11 14:02
 * @Author:zpc@qq.com
 */
@Service
public class StorageServiceImpl implements StorageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageDao storageDao;

    /**
     * 扣减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId,count);
        LOGGER.info("------->storage-service中扣减库存结束");
    }
}

