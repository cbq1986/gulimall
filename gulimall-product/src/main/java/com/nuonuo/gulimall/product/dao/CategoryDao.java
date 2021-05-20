package com.nuonuo.gulimall.product.dao;

import com.nuonuo.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chibenqiang
 * @email chibenqiang@gmail.com
 * @date 2021-05-19 20:52:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
