package com.zensar.main;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.zensar.model.Employee1;

public class HibernateAssignment2 
{
	public static  void main(String[] args)
	{
		@SuppressWarnings({ "unchecked" })
		SessionFactory factory=null;
		Session session=null;
		try
		{
			factory=new Configuration()
					.addAnnotatedClass(Employee1.class)
					.configure().buildSessionFactory();
	

			//1.Total salary
			Criteria cr = session.createCriteria(Employee1.class);
			cr.setProjection(Projections.sum("salary"));
			List<?> ts = cr.list();
			System.out.println(ts+"\n");

			//2.Employee ordered by salary using criteria
			Criteria cr1 = session.createCriteria(Employee1.class);
			cr1.addOrder(Order.asc("salary"));
			List<Employee1> l = cr1.list();
			l.forEach(System.out::println);

			//2.Ordered by Salary Using HQL
			String hql = "select e from Employee e order by e.salary";
			Query q = session.createQuery(hql);
			List<?> sl1 = q.getResultList();
			sl1.forEach(System.out::println);

			//3.Group by City
			String hql1 = "select e.city,count(e.name) from Employee e group by e.city";
			Query q1 = session.createQuery(hql1);
			List<?> gl = q1.getResultList();
			for(int i=0; i<gl.size(); i++) {
			Object[] row = (Object[]) gl.get(i);
			System.out.println(row[0]+", "+ row[1]);
			}

			//4.Average Salary
			Criteria cr2 = session.createCriteria(Employee1.class);
			cr2.setProjection(Projections.avg("salary"));
			List<?> as = cr2.list();
			System.out.println(as);

			//5.Salary More Than 10000
			Criteria cr3 = session.createCriteria(Employee1.class);
			cr3.add(Restrictions.gt("salary", 20000));
			List<?> slm = cr3.list();
			slm.forEach(System.out::println);


			//6.Named Queries
			Query q2 =session.createNamedQuery("total");
			q2.getResultList().forEach(System.out::println);

			Query q3 =session.createNamedQuery("order");
			q3.getResultList().forEach(System.out::println);

			Query q4 =session.createNamedQuery("group");
			List<?> l1 = q4.getResultList();
			for(int i=0; i<l1.size(); i++) {
			Object[] row = (Object[]) l1.get(i);
			System.out.println(row[0]+", "+ row[1]);
			}

			Query q5 =session.createNamedQuery("average");
			q5.getResultList().forEach(System.out::println);

			Query q6 =session.createNamedQuery("moreThen");
			q6.getResultList().forEach(System.out::println);

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
