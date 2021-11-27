package com.wzx.shardingsphere.inline_demo.service;

import com.wzx.shardingsphere.inline_demo.entity.TOrder;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangzhengxi
 * @since 2019-05-23
 */
public interface ITOrderService  extends IService<TOrder>{

    TOrder selectById(TOrder tOrder);

    TOrder selectByUserId(TOrder tOrder);

}
