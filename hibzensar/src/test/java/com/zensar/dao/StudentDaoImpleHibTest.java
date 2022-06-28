package com.zensar.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.zensar.model.Student;

class StudentDaoImpleHibTest 
{
	StudentDaoImpleHib sdao = new StudentDaoImpleHib();
	int addedid = 5;
	@BeforeAll
	static void setUpBeforeClass() throws Exception
	{
		System.out.println("opening the connection");
		HibSessionProvider.getSession(); //connected to db
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
		System.out.println("closing the connection");
		HibSessionProvider.closeSession(); // close the connected after test
	}
	@Test
	void testGetStudent() 
	{
		Student student = sdao.getStudent(2); // got from session managed by Hibernate
		//If you make change to this, it will be done in database as well
		//if you remove, row will be removed from database
		System.out.println(student);
		assertNotNull(student);
		assertEquals(student, getSid(),2);
	}
	private void assertEquals(Student student, int sid, int i) {
		// TODO Auto-generated method stub
		
	}
	private int getSid() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Test
	void testFinAll()
	{
		List<Student> list = sdao.finAll();
		assertTrue(list.size()>4);
	}
	@Test
	void testUpdateStudent()
	{
		//to make change in DB, you must be in a transaction
		HibSessionProvider.getSession().getTransaction().begin();

		Student student = sdao.getStudent(1);
		student.setSname("New Name From Junit");
		sdao.updateStudent(student);
		assertEquals(student.getSname(), "New Name From Junit");

		HibSessionProvider.getSession().getTransaction().commit();;				
	}
	private void assertEquals(String sname, String string) {
		// TODO Auto-generated method stub
		
	}
	@Test
	void testAddStudent()
	{
		HibSessionProvider.getSession().getTransaction().begin();

		Student student = new Student(addedid, "Parmanand", "par123@gmail.com","867754", "CSE");
		Student addStudent = sdao.addStudent(student);
		assertNotNull(addStudent);
	}
	@Test
	void testRemove()
	{
		HibSessionProvider.getSession().getTransaction().begin();
		Student student = sdao.getStudent(addedid);
		if(student != null)
			sdao.remove(student);

		assertNull(sdao.getStudent(addedid));
		HibSessionProvider.getSession().getTransaction().commit();;
	}

}



