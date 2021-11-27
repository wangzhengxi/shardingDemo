package com.wzx.shardingsphere.inline_demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wzx.shardingsphere.inline_demo.entity.TTest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangzhengxi
 * @since 2019-05-23
 */
public interface ITTestService extends IService<TTest>{

    TTest selectById(TTest tTest);
    int tr();
}
