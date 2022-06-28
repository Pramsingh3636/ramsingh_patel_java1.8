package com.zensar.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibSessionProvider 
{
	private static Session session = null;
	private static SessionFactory factory = null;

	public static Session getSession()
	{
		if(session != null && session.isOpen())
			return session;
		
		factory = new Configuration().configure().buildSessionFactory();
		System.out.println("factory created " + factory);
		session = factory.openSession();
		return session;
	}
	public static void closeSession()
	{
		session.close();
		factory.close();
	}
}
