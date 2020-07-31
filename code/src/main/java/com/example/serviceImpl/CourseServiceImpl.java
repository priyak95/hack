package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.mapper.CourseMapper;
import com.example.model.Course;
import com.example.model.CourseExample;
import com.example.service.CourseService;

public class CourseServiceImpl implements CourseService {
	
	@Autowired
	CourseMapper courseMapper;
	
	

	@Override
	public List<Course> getAll() {
		CourseExample example = new CourseExample();
		List<Course> courseList = courseMapper.selectByExample(example);
		return courseList;
	}
	
	

}
