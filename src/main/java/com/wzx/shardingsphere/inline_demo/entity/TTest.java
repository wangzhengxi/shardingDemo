package com.wzx.shardingsphere.inline_demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangzhengxi
 * @since 2019-05-23
 */
@Data
public class TTest implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer orderId1;

    private Integer userId;

    private String status;

    @Override
    public String toString() {
        return "TOrder{" +
        "orderId1=" + orderId1 +
        ", userId=" + userId +
        ", status=" + status +
        "}";
    }
}
