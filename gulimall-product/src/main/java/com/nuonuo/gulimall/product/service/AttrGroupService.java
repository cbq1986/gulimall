package com.nuonuo.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nuonuo.common.utils.PageUtils;
import com.nuonuo.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author chibenqiang
 * @email chibenqiang@gmail.com
 * @date 2021-05-19 20:52:25
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

