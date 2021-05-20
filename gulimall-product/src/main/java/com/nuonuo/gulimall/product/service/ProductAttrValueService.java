package com.nuonuo.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nuonuo.common.utils.PageUtils;
import com.nuonuo.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author chibenqiang
 * @email chibenqiang@gmail.com
 * @date 2021-05-19 20:52:25
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

