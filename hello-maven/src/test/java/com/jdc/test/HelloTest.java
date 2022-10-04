package com.jdc.test;

import org.junit.jupiter.api.Test;

import com.jdc.maven.Course;
import com.jdc.maven.CourseInsert;

public class HelloTest {
	
	@Test
	void test() {
		
		var course = new Course();
		course.setName("Full Stack Spring");
		course.setFees(250000);
		course.setDuration(4);
		
		var insert = new CourseInsert();
		insert.insert(course);
		
	}

}
