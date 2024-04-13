package com.sjz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sjz.gulimall.common.utils.PageUtils;
import com.sjz.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author song.junzheng
 * @email fengchen692@gmail.com
 * @date 2024-04-13 11:27:24
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

