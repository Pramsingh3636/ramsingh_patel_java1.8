package com.zensar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.model.Student;
import com.zensar.service.StudentService;

@RestController
public class StudentController
{
	@Autowired
	StudentService studentService;
	
	// GET, POST, PUT, DELETE, HEAD, OPTION 
	@RequestMapping(path = "/anystudent", method = RequestMethod.GET)
	public String getAnyStudent()
	{
		Student anyStudent = studentService.getAnyStudent();
		System.out.println("studetn in controller " + anyStudent);
		String string = anyStudent.toString();
		return string; //name of html page which is not
	}
	@RequestMapping(path = "/anystudentobj", method = RequestMethod.GET)
	public Student getAnyStudentAsObject()
	{
		Student anyStudent = studentService.getAnyStudent();
		System.out.println("studetn in controller " + anyStudent);
		return anyStudent;
	}
	@GetMapping("/allstudents")
	public List<Student> getAllStudents()
	{
		List<Student> list = studentService.getAllStudents();
		System.out.println("studetn in controller " + list);
		return list;
	}
	/*
	 * end point for all students GET
	 * end point for one student GET
	 * end point (URL + method) for update a student PUT
	 * end point for adding a student POST
	 * end point for deleting a student DELETE
	 */
	@GetMapping("/api/student/{sid}")
	public Student getStudent(@PathVariable("sid") int sid)
	{
		Student student = studentService.getStudent(sid);
		return student;
	}
	@PostMapping("/api/student")
	public Student addStudent(@RequestBody Student student)
	{
		Student addStudent = studentService.addStudent(student);
		System.out.println(addStudent);
		return addStudent;
	}

}





