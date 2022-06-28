package com.zensar.service;

import java.util.List;

import com.zensar.model.Student;

public interface StudentService
{
	public Student getAnyStudent();
	public Student getStudent(int sid);
	public List<Student> getAllStudents();
	public boolean checkLogin(String userid, String password);
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public boolean deleteStudent(Student student);	
}

