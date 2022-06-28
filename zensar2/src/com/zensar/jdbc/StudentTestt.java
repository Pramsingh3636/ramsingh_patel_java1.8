package com.zensar.jdbc;

import java.sql.SQLException;
import java.util.List;

import com.zensar.dao.DBConnection;
import com.zensar.dao.StudentDao;
import com.zensar.dao.StudentDaoImpl;
import com.zensar.model.Student;

public class StudentTestt
{
	public static void main(String[] args)
	{
		try
		{
			StudentDao dao = new StudentDaoImpl();
//			Student student = dao.getStudent(1);
//			System.out.println(student);

			List<Student> list = dao.finAll();
			for(Student s : list)
				System.out.println(s);
			
			Student student2 = dao.getStudent(2);
			student2.setSname("Ram singh");
			student2.setPhone("852963");
			student2.setBranch("ECE");
			dao.updateStudent(student2);

//			boolean success = dao.remove(student);
//			System.out.println("student removed " + success);
//			Student st = new Student(2, "RamSingh", "r.patel@zensar.com","875487", "CSE");
//			dao.addStudent(st);
		}
		finally
		{
			try
			{
				DBConnection.getConnection().close();
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
}
