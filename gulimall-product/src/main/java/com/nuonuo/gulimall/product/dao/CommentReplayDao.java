package com.nuonuo.gulimall.product.dao;

import com.nuonuo.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author chibenqiang
 * @email chibenqiang@gmail.com
 * @date 2021-05-19 20:52:25
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
