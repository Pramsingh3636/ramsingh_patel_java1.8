package com.zensar.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zensar.model.Mobile;
import com.zensar.model.Parking;
import com.zensar.model.Student;

public class HibernateMainTest {

	public static void main(String[] args) 
	{
		SessionFactory factory = null; //JPA says EntityManagerFactory
		Session session = null;
		try
		{
			factory = new Configuration()
					  .addAnnotatedClass(Parking.class)
					  .addAnnotatedClass(Mobile.class)
					  .configure().buildSessionFactory();
			
			System.out.println("factory created " + factory);
			
			session = factory.openSession(); //one object store to store objects
			System.out.println("session created " + session);
			
			Student student = session.get(Student.class, 2);
			System.out.println(student);
			
			Parking parking = session.get(Parking.class, 1);
			System.out.println(parking);
			
			Mobile mobile = session.get(Mobile.class, 2);
			System.out.println(mobile);			
			
			session.getTransaction().begin(); // begin Transaction
//			Parking parking2 = new Parking(6,3,105,"Shyam");	
//			session.save(parking2);
//			System.out.println("saved parking in DB " + parking2);
			
			Mobile mobile2 = new Mobile(103, "iPhone","60 mbps", 64, 6.0);
			session.save(mobile2);
			System.out.println("Mobile available in company " + mobile2);
			session.getTransaction().commit(); // commit transaction			
			
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
