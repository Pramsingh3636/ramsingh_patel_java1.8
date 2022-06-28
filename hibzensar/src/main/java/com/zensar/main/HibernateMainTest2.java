package com.zensar.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zensar.model.Department;
import com.zensar.model.Employee;
import com.zensar.model.Parking;
import com.zensar.model.Project;

public class HibernateMainTest2 
{
	public static void main(String[] args) 
	{
		SessionFactory factory = null; //JPA says EntityManagerFactory
		Session session = null;
		try
		{
			factory = new Configuration()
					  .addAnnotatedClass(Parking.class)
					  .addAnnotatedClass(Employee.class)
					  .addAnnotatedClass(Department.class)
					  .addAnnotatedClass(Project.class)
					  .configure().buildSessionFactory();
			
			System.out.println("factory created " + factory);
			
			session = factory.openSession(); //one object store to store objects
			System.out.println("session created " + session);
			
			Parking parking = session.get(Parking.class, 1);
			System.out.println(parking);
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
