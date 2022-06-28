package com.zensar.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zensar.model.Bike;
import com.zensar.model.Car;
import com.zensar.model.Vehicle;

public class HibernateAssignment6
{
	public static void main(String[] args) 
	{
		SessionFactory factory=null;
		Session session=null;
		try
		{
			factory=new Configuration()
					.addAnnotatedClass(Vehicle.class)
					.addAnnotatedClass(Car.class)
					.addAnnotatedClass(Bike.class)
					.configure().buildSessionFactory();
			session=factory.openSession();

			//6(a). Table Per Hierarchy
			Vehicle vehicle = new Vehicle();
			vehicle.setVid(10);
			vehicle.setVname("Bhima");
			vehicle.setType("Private");

			Bike b=new Bike();
			b.setVname("Indian");
			b.setBmodel("Scout");

			session.getTransaction().begin();
			session.save(b);
			session.save(b);
			System.out.println("Object saved successfully.....!!");
			session.getTransaction().commit();

			//6(b). Table Per Concrete class
			Car car=new Car();
			car.setVname("Thar");
			car.setCmodel("Mahindra");

			Bike bike=new Bike();
			bike.setVid(11);
			bike.setVname("Audi");
			bike.setBmodel("Q8");

			session.getTransaction().begin();
			session.save(bike);
			session.save(bike);
			System.out.println("Object saved successfully.....!!");
			session.getTransaction().commit();

			//6(c). Table Per Subclass
			Vehicle vehicle3 = new Vehicle();
			vehicle3.setVid(1);
			vehicle3.setVname("Tata");
			vehicle3.setType("Commercial");

			Car car2 = new Car();
			car2.setVname("Mercedes");
			car2.setCmodel("Benz");

			Bike bike2 = new Bike();
			bike2.setVname("Ducati");
			bike2.setBmodel(" Panigale");

			System.out.println("Vehicle objects Saved");

			session.save(vehicle);
			session.save(car);
			session.save(bike);
			System.out.println("Object saved successfully.....!!");

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