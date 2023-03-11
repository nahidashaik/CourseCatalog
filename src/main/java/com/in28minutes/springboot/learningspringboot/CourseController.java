package com.in28minutes.springboot.learningspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//create a rest api with url/courses
//when hit that url return the below data from course controller
//http://localhost:8080/courses
//	{
//		"id":1,
//		"name":"Learn AWS",
//		"author":"in28minutes"
//	}
@RestController	//building a restapi
public class CourseController {
	//map url to this speciifc method
	//url:/courses
	//returning this list of courses back
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1, "Learn AWS","in28minutes"),
				new Course(2,"Learn DevOps","in28minutes"),
				new Course(3,"Learn Azure","in28minutes"),
				new Course(4,"Learn GCP","in28minutes"),
				new Course(5,"Learn Spring","in28minutes"),
				new Course(6,"Learn java","in28minutes"),
				new Course(6,"Learn Restapi","in28minutes")
				);
	}
}
