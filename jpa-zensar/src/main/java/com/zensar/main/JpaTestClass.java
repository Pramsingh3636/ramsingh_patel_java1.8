package com.zensar.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.zensar.model.Employee2;
import com.zensar.model.Employee3;
import com.zensar.model.PartTimeEmp;
import com.zensar.model.PartTimeEmp2;
import com.zensar.model.PartTimeEmp3;
import com.zensar.model.RegEmp;

public class JpaTestClass
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf= null;
		EntityManager em = null;
		try
		{
			//SessionFacoty
			emf = Persistence.createEntityManagerFactory("zensar-pu");
			//Session
			em = emf.createEntityManager();
			//session.get( )

			RegEmp emp  = new RegEmp();
			emp.setEmpid(102);
			emp.setName("Ramsingh");
			emp.setSalary(15000);
			//save in db

			PartTimeEmp emp2 = new PartTimeEmp();
			emp2.setEmpid(103);
			emp2.setName("Harish");
			emp2.setDailycharges(1000);

			Employee2 emp22 = new Employee2();
			emp22.setEmpid(302);
			emp22.setName("Ram");

			PartTimeEmp2 ptEmp2 = new PartTimeEmp2();
			ptEmp2.setEmpid(303);
			ptEmp2.setName("Ganesh");
			ptEmp2.setDailycharges(1500);




			Employee3 emp32 = new Employee3();
			emp32.setEmpid(302);
			emp32.setName("Durgesh");

			PartTimeEmp3 ptEmp32 = new PartTimeEmp3();
			ptEmp32.setEmpid(303);
			ptEmp32.setName("Akshay");
			ptEmp32.setDailycharges(1500);

			em.getTransaction().begin();
			em.persist(emp);
			em.persist(emp2);
			em.persist(ptEmp2);
			em.persist(emp22);

			em.persist(emp32);
			em.persist(ptEmp32);

			em.getTransaction().commit();


			System.out.println(emp);
			System.out.println(emp2);

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
