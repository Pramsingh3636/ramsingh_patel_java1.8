package com.zensar.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zensar.model.Customer;
import com.zensar.model.Enquiry;

public class HibernateAssignment3
{
	public static  void main(String[] args)
	{
		SessionFactory factory=null;
		Session session=null;
		try
		{
			factory=new Configuration()
					.addAnnotatedClass(Customer.class)
					.addAnnotatedClass(Enquiry.class)
					.configure().buildSessionFactory();
			
			//1.Retrieve
			Enquiry e1 = session.get(Enquiry.class,1);
			System.out.println(e1);

			//2.create
			session.getTransaction().begin();
			Customer c2 = new Customer(1,"Ram","singh");
			session.save(c2);
			Enquiry e2 = new Enquiry(2,"Loot",c2);
			session.save(e2);
			System.out.println("Added Enquiry : "+e1);
			session.getTransaction().commit();

			//3.Update
			session.getTransaction().begin();
			Enquiry e3 = session.get(Enquiry.class,2);
			e3.setEid(1);
			session.save(e3);
			session.getTransaction().commit();
			System.out.println("Updated Eid of Enquiry  "+e3.getEid());

			//4.Delete
			session.getTransaction().begin();
			Enquiry e8 = session.get(Enquiry.class,7);
			session.delete(e8);
			session.getTransaction().commit();
			System.out.println("Enquiry details deleted");

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