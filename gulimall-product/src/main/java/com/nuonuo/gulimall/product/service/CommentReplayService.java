package com.nuonuo.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nuonuo.common.utils.PageUtils;
import com.nuonuo.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author chibenqiang
 * @email chibenqiang@gmail.com
 * @date 2021-05-19 20:52:25
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

