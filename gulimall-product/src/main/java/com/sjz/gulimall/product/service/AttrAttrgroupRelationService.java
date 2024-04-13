package com.sjz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sjz.gulimall.common.utils.PageUtils;
import com.sjz.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author song.junzheng
 * @email fengchen692@gmail.com
 * @date 2024-04-13 11:27:25
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

