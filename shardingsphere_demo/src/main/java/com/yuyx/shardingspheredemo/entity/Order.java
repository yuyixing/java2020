package com.yuyx.shardingspheredemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author yuyx
 */
@Data
@TableName("t_order")
public class Order {
    private Long orderId;
    private Long userId;
    private String status;
}
