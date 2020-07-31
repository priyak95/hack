package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.mapper.CourseMapper;
import com.example.demo.model.Course;
import com.example.demo.model.CourseExample;
import com.example.demo.service.CourseService;

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
