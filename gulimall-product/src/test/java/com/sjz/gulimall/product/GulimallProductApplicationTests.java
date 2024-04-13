package com.sjz.gulimall.product;

import com.sjz.gulimall.product.entity.BrandEntity;
import com.sjz.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GulimallProductApplicationTests {

    @Resource
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("还未");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
