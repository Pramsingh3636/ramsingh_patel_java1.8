package com.zensar.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.model.Student;
import com.zensar.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student getAnyStudent()
	{
		Student student = studentRepository.findById(3).get();
		System.out.println("student in repo " + student);
		return student;
	}

	@Override
	public Student getStudent(int sid)
	{
		return null;
	}

	@Override
	public List<Student> getAllStudents()
	{
		return studentRepository.findAll();
	}

	@Override
	public boolean checkLogin(String userid, String password)
	{
		return false;
	}

	public StudentRepository getStudentRepository()
	{
		return studentRepository;
	}

	public void setStudentRepository(StudentRepository studentRepository)
	{
		this.studentRepository = studentRepository;
	}
	@Override
	@Transactional
	public Student addStudent(Student student)
	{
		Student savedStudent = studentRepository.save(student);
		return savedStudent;
	}
	@Override
	@Transactional
	public Student updateStudent(Student student)
	{
		//first check if student exists, update it
		//else return null
		return null;
	}
	@Override
	public boolean deleteStudent(Student student)
	{
		//first check if student exists, delete it
		//else return false
		return false;
	}

	
}



