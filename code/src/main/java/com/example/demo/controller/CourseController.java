package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Course;
import com.example.demo.serviceImpl.CourseServiceImpl;

@RestController
@RequestMapping("/code")
public class CourseController {
	

	
	@Autowired
	CourseServiceImpl courseServiceImpl;

	@GetMapping("/all")
	public List<Course> getAll()
	{
		List<Course> course = courseServiceImpl.getAll();
		return course;
		
	}
}
