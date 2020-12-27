package com.yuyx.shardingspheredemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yuyx.shardingspheredemo.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author yuyixing
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

}
