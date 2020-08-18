package com.myaws.test.myapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class MyAwsController {

	@GetMapping
	public String getHome() {
		return "This is my first deployment";
	}
	
	@GetMapping("/student")
	public Student getStudent() {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Juan");
		student.setLastName("Dela Cruz");
		
		
		return student;
	}
	
	@GetMapping(value = "/students")
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Juan");
		student.setLastName("Dela Cruz");
		students.add(student);
		student = new Student();
		student.setId(2);
		student.setFirstName("Peter");
		student.setLastName("Rocksteel");
		students.add(student);
		student = new Student();
		student.setId(3);
		student.setFirstName("Princess");
		student.setLastName("Ante");
		students.add(student);
		
		return students;
	}
	
	@GetMapping(value = "/studentsjson", produces = "application/json")
	public List<Student> getStudentsJson() {
		List<Student> students = new ArrayList<>();
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Juan");
		student.setLastName("Dela Cruz");
		students.add(student);
		student = new Student();
		student.setId(2);
		student.setFirstName("Peter");
		student.setLastName("Rocksteel");
		students.add(student);
		student = new Student();
		student.setId(3);
		student.setFirstName("Princess");
		student.setLastName("Ante");
		students.add(student);
		
		return students;
	}
	
	@GetMapping(value = "/studentsxml", produces = { "application/xml", "text/xml" })
	public List<Student> getStudentsXml() {
		List<Student> students = new ArrayList<>();
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Juan");
		student.setLastName("Dela Cruz");
		students.add(student);
		student = new Student();
		student.setId(2);
		student.setFirstName("Peter");
		student.setLastName("Rocksteel");
		students.add(student);
		student = new Student();
		student.setId(3);
		student.setFirstName("Princess");
		student.setLastName("Ante");
		students.add(student);
		
		return students;
	}
	
}
