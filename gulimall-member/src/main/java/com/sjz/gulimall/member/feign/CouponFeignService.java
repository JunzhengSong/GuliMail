package com.sjz.gulimall.member.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author sjz
 * @version 1.0
 * @description TODO
 * @date 2024/4/13 16:32
 */

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

}
