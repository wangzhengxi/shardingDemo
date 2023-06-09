package com.wzx.shardingsphere.inline_demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wzx.shardingsphere.inline_demo.entity.TOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangzhengxi
 * @since 2019-05-23
 */
@Mapper
public interface TOrderMapper extends BaseMapper<TOrder>{

    TOrder getById(@Param("orderId") String orderId);

    TOrder getByUserId(@Param("userId") Long userId);
}
