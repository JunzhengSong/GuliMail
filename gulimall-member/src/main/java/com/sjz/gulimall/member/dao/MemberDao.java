package com.sjz.gulimall.member.dao;

import com.sjz.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author song.junzheng
 * @email fengchen@gmail.com
 * @date 2024-04-13 14:55:33
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
