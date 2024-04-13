package com.sjz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sjz.gulimall.common.utils.PageUtils;
import com.sjz.gulimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author song.junzheng
 * @email fengchen692@gmail.com
 * @date 2024-04-13 11:27:23
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

