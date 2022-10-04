package com.jdc.maven;

import java.sql.DriverManager;
import java.sql.SQLException;

public class CourseInsert {
	
	private static final String URL = "jdbc:mysql://localhost:3306/hello_maven";
	private static final String USER = "root";
	private static final String PASS = "admin";
	private static final String SQL = "insert into course (name, fees, duration) values (?, ?, ?)";

	public void insert(Course course) {
		try(
			var connection = DriverManager.getConnection(URL, USER, PASS);
			var statement = connection.prepareStatement(SQL)){
			
			statement.setString(1, course.getName());
			statement.setInt(2, course.getFees());
			statement.setInt(3, course.getDuration());
			
			statement.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
