package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.example.demo.model.Progress;
import com.example.demo.model.ProgressExample;

public interface ProgressMapper {
    long countByExample(ProgressExample example);

    int deleteByExample(ProgressExample example);

    int insert(Progress record);

    int insertSelective(Progress record);

    List<Progress> selectByExampleWithRowbounds(ProgressExample example, RowBounds rowBounds);

    List<Progress> selectByExample(ProgressExample example);

    int updateByExampleSelective(@Param("record") Progress record, @Param("example") ProgressExample example);

    int updateByExample(@Param("record") Progress record, @Param("example") ProgressExample example);
}