package com.sjz.gulimall.product.dao;

import com.sjz.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author song.junzheng
 * @email fengchen692@gmail.com
 * @date 2024-04-13 11:27:24
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
