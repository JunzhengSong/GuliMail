package com.sjz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sjz.gulimall.common.utils.PageUtils;
import com.sjz.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author song.junzheng
 * @email fengchen692@gmail.com
 * @date 2024-04-13 11:27:24
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

