package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.example.demo.model.Users;
import com.example.demo.model.UsersExample;

public interface UsersMapper {
    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExampleWithRowbounds(UsersExample example, RowBounds rowBounds);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}