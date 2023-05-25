package com.example.keshe3.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.keshe3.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
