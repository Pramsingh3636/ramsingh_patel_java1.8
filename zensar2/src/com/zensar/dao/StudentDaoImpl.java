package com.zensar.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.zensar.model.Student;

public class StudentDaoImpl implements StudentDao
{
	public Student getStudent(int sid)
	{
		try
		{
			Connection connection = DBConnection.getConnection();

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from student where sid = " + sid);
			//there will 1 line result sid is primary key
			if(resultSet.next() == true) //there is row
			{
				int sid2 = resultSet.getInt("sid");
				String name = resultSet.getString("sname");
				String email = resultSet.getString("email");
				String phone = resultSet.getString("phone");
				String branch = resultSet.getString("branch");
				Student obj = new Student(sid, name, email, phone, branch);
				return obj;
			}
			return null;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public List<Student> finAll()
	{
		List<Student> list = new ArrayList<>();
		try
		{
			Connection connection = DBConnection.getConnection();

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from student ");
			//there will 1 line result sid is primary key
			while(resultSet.next() == true) //there is row
			{
				int sid2 = resultSet.getInt("sid");
				String name = resultSet.getString("sname");
				String email = resultSet.getString("email");
				String phone = resultSet.getString("phone");
				String branch = resultSet.getString("branch");
				Student obj = new Student(sid2, name, email, phone, branch);
				list.add(obj);
			}
			return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return list;
	}
	@Override
	public Student updateStudent(Student student)
	{
		// to update update student set name='name' , branch='branch', email='email' where sid= ?
		try
		{
			Connection connection = DBConnection.getConnection();
			String updateSt = "update student set sname=? , branch=?, email=?, phone=? where sid=?";
			PreparedStatement pst = connection.prepareStatement(updateSt);
			// now to fill ? with actual data
			pst.setString(1, student.getSname()); //1 for 1st ?
			pst.setString(2, student.getBranch()); // 2 for 2nd ? 
			pst.setString(3, student.getEmail());
			pst.setString(4, student.getPhone());
			pst.setInt(5, student.getSid());

			int rows = pst.executeUpdate();
			System.out.println("rows updated = " + rows);
			//ideally 1 row must be updated
			if(rows == 1) 
				return student;
			return null;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Student addStudent(Student student)
	{
		try
		{
			Connection connection = DBConnection.getConnection();
			String updateSt = "insert into student (sid, sname, email, phone,branch) values (?,?,?,?,?) ";
			PreparedStatement pst = connection.prepareStatement(updateSt);
			// now to fill ? with actual data
			pst.setInt(1, student.getSid());
			pst.setString(2, student.getSname()); //1 for 1st ?
			pst.setString(3, student.getEmail());
			pst.setString(4, student.getPhone());
			pst.setString(5, student.getBranch()); // 2 for 2nd ? 

			int rows = pst.executeUpdate();
			System.out.println("rows inserted = " + rows);
			//ideally 1 row must be inserted
			if(rows == 1) 
				return student;
			return null;

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean remove(Student student)
	{
		try
		{
			Connection connection = DBConnection.getConnection();
			String updateSt = "delete from student where sid = ? ";
			PreparedStatement pst = connection.prepareStatement(updateSt);
			// now to fill ? with actual data
			pst.setInt(1, student.getSid());
			int rows = pst.executeUpdate();
			System.out.println("rows deleted = " + rows);
			//ideally 1 row must be inserted
			if(rows == 1) 
				return true;
			return false;

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public List<Student> findByName(String sname) {
		List<Student> list = new ArrayList<>();
		try
		{
			Connection connection = DBConnection.getConnection();

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from student where sname =" +sname);
			
			while(resultSet.next() == true) 
			{
				int sid2 = resultSet.getInt("sid");
				String sname2 = resultSet.getString("sname");
				String email = resultSet.getString("email");
				String phone = resultSet.getString("phone");
				String branch = resultSet.getString("branch");
				Student std = new Student(sid2, sname2, email, phone, branch);
				list.add(std);
			}
			return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;	
	}
}
	
	
	
	
	
	
	
	