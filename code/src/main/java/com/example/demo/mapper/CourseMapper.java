package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.example.demo.model.Course;
import com.example.demo.model.CourseExample;

public interface CourseMapper {
    long countByExample(CourseExample example);

    int deleteByExample(CourseExample example);

    int deleteByPrimaryKey(Long courseId);

    int insert(Course record);

    int insertSelective(Course record);

    List<Course> selectByExampleWithRowbounds(CourseExample example, RowBounds rowBounds);

    List<Course> selectByExample(CourseExample example);

    Course selectByPrimaryKey(Long courseId);

    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}