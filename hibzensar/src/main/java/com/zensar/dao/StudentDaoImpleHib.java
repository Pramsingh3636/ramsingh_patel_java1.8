package com.zensar.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.zensar.model.Student;

public class StudentDaoImpleHib implements StudentDao
{
	Session session;
	public StudentDaoImpleHib()
	{
		session = HibSessionProvider.getSession();
	}
	public Student getStudent(int sid)
	{
		Student student = session.get(Student.class, sid);
		return student;
	}	
	public List<Student> finAll()
	{
		Query query = session.createQuery("select s from Student s");
		List<Student> list = query.getResultList();
		return list;
	}
	public Student updateStudent(Student student)
	{
		Student stInDb = session.get(Student.class, student.getSid());
		if(stInDb == null)
			return null;
		session.persist(student);
		return student;
	}
	public Student addStudent(Student student)
	{
		session.save(student);
		return student;
	}
	public boolean remove(Student student)
	{
		session.remove(student);
		return true;
	}
	@Override
	public List<Student> findByName(String sname) 
	{
		Query query = session.createQuery("select s from Student s where s.name = : name");
		query.setParameter("name", sname);
		List<Student> list = query.getResultList();
		System.out.println(list);
		return list;
	}
}





