
package com.zensar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.model.Student;
import com.zensar.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student getStudent(int sid) 
	{
		Optional<Student> optStudent = studentRepository.findById(sid);
		Student student = optStudent.get();
		return student;
	}

	
}