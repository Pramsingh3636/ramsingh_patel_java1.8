package com.zensar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zensar.model.Student;
import com.zensar.service.DeptMgmtService;
import com.zensar.service.StudentService;

@SpringBootApplication
public class BootJpaApplication implements CommandLineRunner
{
	@Autowired
	StudentService studentService;
	
	@Autowired
	DeptMgmtService depService;
	
	public static void main(String[] args) 
	{
		SpringApplication.run(BootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		System.out.println("Get a student from student Service");
		Student student = studentService.getStudent(3);
		System.out.println(student);
		System.out.println();
		depService.printEmployeeAndDeptNames();
	}

}
