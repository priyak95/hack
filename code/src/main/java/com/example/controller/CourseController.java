package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapper.CourseMapper;
import com.example.model.Course;
import com.example.serviceImpl.CourseServiceImpl;

@RestController
@RequestMapping("/code")
public class CourseController {
	
	@Autowired
	private CourseMapper courseMapper;
	
	@Autowired
	CourseServiceImpl courseServiceImpl;

	@GetMapping("/all")
	public List<Course> getAll()
	{
		List<Course> course = courseServiceImpl.getAll();
		return course;
		
	}
}
