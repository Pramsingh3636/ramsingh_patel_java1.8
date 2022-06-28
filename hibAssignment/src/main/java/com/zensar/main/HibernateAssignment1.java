package com.zensar.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zensar.model.Student;

public class HibernateAssignment1 
{
	public static  void main(String[] args)
	{
		SessionFactory factory=null;
		Session session=null;
		try
		{
			factory=new Configuration()
					.addAnnotatedClass(Student.class)
					.configure().buildSessionFactory();
			session=factory.openSession();


			//Create
			session.getTransaction().begin();
			Student s = new Student(2,"Ram","r123@gmail.com","6372362538","CSE");
			session.save(s);
			System.out.println("Created Student detail: "+s);
			session.getTransaction().commit();

			//Retrieve
			Student s2 = session.get(Student.class, 7);
			System.out.println(s2);

			//Update 
			System.out.println();
			session.getTransaction().begin();
			Student s3 = session.get(Student.class, 6);
			s3.setName("Lucky");
			session.save(s3);
			session.getTransaction().commit();
			System.out.println("Updated Student detail : "+s3);

			//Delete
			System.out.println();
			session.getTransaction().begin();
			Student s4 = session.get(Student.class, 4);
			session.delete(s4);
			System.out.println("Deleted Student : "+s4);
			session.getTransaction().commit();

			//The difference between get() & load() methods 
			Student o5 = session.load(Student.class, 1);
			System.out.println(o5);
			Student o6 = session.load(Student.class, 3);
			System.out.println(o6);

			// SQL Query
			session.getTransaction().begin();
			int query = session.createSQLQuery("insert into Student values (9,'Bhimsen','bhim@gmail.com','6787434787','CSE');").executeUpdate();
			session.getTransaction().commit();
			System.out.println(query);

			//  AUTO, TABLE, SEQUENCE & IDENTITY
			System.out.println();
			session.getTransaction().begin();
			Student s7 = new Student(4,"Harish","har11@gmail.com","7593664375","IT");
			session.save(s7);
			System.out.println("Added order : "+s7);
			session.getTransaction().commit();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
			factory.close();
		}
	}
}
