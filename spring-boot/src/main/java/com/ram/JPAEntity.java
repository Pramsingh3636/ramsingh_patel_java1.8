package com.ram;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAEntity
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf= null;
		EntityManager em = null;

		try
		{
			//SessionFacoty
			emf = Persistence.createEntityManagerFactory("Employee");
			//Session
			em = emf.createEntityManager();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
			emf.close();
		}
	}
}

