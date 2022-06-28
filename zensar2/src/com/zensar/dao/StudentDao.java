package com.zensar.dao;

import java.util.List;

import com.zensar.model.Student;

public interface StudentDao
{
	public Student getStudent(int sid);
	public List<Student> finAll();
	public Student updateStudent(Student student);
	public Student addStudent(Student student);
	public boolean remove(Student student);
	
	public List<Student> findByName(String sname);
	

}


/*
 * Application  
// *getStudent(sid)
 * findAll()
 * updateStudent()
 * addStudent()
 * removeStudent() 
 */
