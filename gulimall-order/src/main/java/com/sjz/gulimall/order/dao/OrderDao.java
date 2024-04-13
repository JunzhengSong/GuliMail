package com.sjz.gulimall.order.dao;

import com.sjz.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author song.junzheng
 * @email fengchen@gmail.com
 * @date 2024-04-13 15:05:25
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
