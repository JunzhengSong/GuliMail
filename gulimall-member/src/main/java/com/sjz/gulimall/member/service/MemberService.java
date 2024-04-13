package com.sjz.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sjz.gulimall.common.utils.PageUtils;
import com.sjz.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author song.junzheng
 * @email fengchen@gmail.com
 * @date 2024-04-13 14:55:33
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

