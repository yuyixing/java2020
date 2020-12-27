package com.yuyx.shardingspheredemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author yuyx
 */
@Data
@TableName("t_user")
public class User {
    private Long userId;
    private String username;
    private String ustatus;
}
