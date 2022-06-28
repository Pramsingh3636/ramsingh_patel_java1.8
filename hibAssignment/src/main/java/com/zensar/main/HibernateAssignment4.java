package com.zensar.main;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zensar.model.Market;
import com.zensar.model.Stock;

public class HibernateAssignment4
{
	public static  void main(String[] args)
	{
		SessionFactory factory=null;
		Session session=null;
		try
		{
			factory=new Configuration()
					.addAnnotatedClass(Market.class)
					.addAnnotatedClass(Stock.class)
					.configure().buildSessionFactory();

			//1.Retrieve
			Market m1 = session.get(Market.class,1);
			System.out.println(m1);

			//2.Create
			session.getTransaction().begin();
			Stock s = session.get(Stock.class, 3);
			Market m2 = new Market(1,"Metro",getmid());
			session.save(m2);
			System.out.println("Added Stock : "+m2);
			session.getTransaction().commit();

			//3.Update
			session.getTransaction().begin();
			Stock s3 = session.get(Stock.class, 2);
			s3.setSid(4);
			session.save(s3);
			System.out.println("Updated Stock : "+s3);
			session.getTransaction().commit();

			//4.Delete
			session.getTransaction().begin();
			Stock s4 = session.get(Stock.class,6);
			session.delete(s4);
			session.getTransaction().commit();
			System.out.println("Stock Deleted");		
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

	private static List<Stock> getmid() {
		// TODO Auto-generated method stub
		return null;
	}
}
