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
public class TOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    private String orderId;

    private Long userId;

    private String status;

//    @Override
//    public String toString() {
//        return "TOrder{" +
//        "orderId=" + orderId +
//        ", userId=" + userId +
//        ", status=" + status +
//        "}";
//    }
}
