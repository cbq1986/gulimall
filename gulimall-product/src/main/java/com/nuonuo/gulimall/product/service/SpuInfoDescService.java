package com.nuonuo.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nuonuo.common.utils.PageUtils;
import com.nuonuo.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author chibenqiang
 * @email chibenqiang@gmail.com
 * @date 2021-05-19 20:52:25
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

