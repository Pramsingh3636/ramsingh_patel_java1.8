package com.zensar.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.zensar.model.Course;
import com.zensar.model.Student2;

public class HibernateAssignment5 
{
	public static  void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("zensar-pu");
		EntityManager em=emf.createEntityManager();

		//Insert
		Student2 s1=new Student2();
		s1.setSid(1);
		s1.setName("Bhimsen");
		s1.setEmail("bhimsen@gmail.com");
		s1.setBranch("CSE");

		Course c=new Course();
		c.setCid(2);
		c.setCname("Full Stack Java");
		c.getCid().add(c);
		s1.getCourse().add(c);
		
		em.getTransaction().begin();
		em.persist(c);
		em.persist(s1);
		em.getTransaction().commit();
		System.out.println("Student added successfully");

		//Update
		Course c2=new Course();
		c2.setCid(2);
		c2.setCname("Net");
		Student2 s2 = em.find(Student2.class, 1);
		s2.setName("Minati");
		s2.setEmail("minati@gmail.com");
		s2.setBranch("Bsc");

		em.getTransaction().begin();
		em.persist(s2);
		em.getTransaction().commit();
		System.out.println("Entity has been updated with"+s2);

		//Retrieve
		Student2 find = em.find(Student2.class,3);
		System.out.println("Geting data "+find);
	}
}
