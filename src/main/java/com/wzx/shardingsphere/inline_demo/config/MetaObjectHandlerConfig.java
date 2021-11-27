package com.wzx.shardingsphere.inline_demo.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 配置公共字段自动填充功能  @TableField(..fill = FieldFill.INSERT)
 * 特别注意，3.0-gamma之前的版本 MetaObjectHandler 是抽象类
 * 3.0-RC之后的版本MetaObjectHandler 是接口
 *
 */
@Component
public class MetaObjectHandlerConfig implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        Object scanTime = getFieldValByName("scanTime", metaObject);
        if (scanTime == null) {
            //mybatis-plus版本2.0.9+
            setFieldValByName("createTime", LocalDateTime.now(), metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        Object scanTime = getFieldValByName("scanTime", metaObject);
        if (scanTime == null) {
            //mybatis-plus版本2.0.9+
            setFieldValByName("createTime", LocalDateTime.now(), metaObject);
        }
    }

}
