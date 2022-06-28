package com.zensar.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlDataSource;

public class ConnectionTest
{
	/* library to connect (driver ) class files written by oracle 
	 * jar (java archive) like for classes and interfaces 
	 * mysql-connector-java 
	 * mvnrepository.com  download jar 
	 * save in my computer
	 * add it in build path 
	 */
	public static void main(String[] args)
	{
		Connection connection = null;
		try
		{
			//			connection = methodOld();
			connection = methodNew();
			printData(connection);
			System.out.println("connection to db " + connection);
		}
		finally
		{
			try
			{
				connection.close();
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	}

	private static void printData(Connection connection)
	{
		Statement statement;
		try
		{
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from sys.student");
			while(resultSet.next())
			{
				int sid = resultSet.getInt("sid");
				String sname = resultSet.getString("sname");
				String email = resultSet.getString("email");
				System.out.println(sid + "\t" + sname + "\t" + email);
			}
			resultSet.close();
			statement.close();
		} catch (SQLException e)
		{
			e.printStackTrace();
		}


	}

	private static Connection methodNew()
	{
		try
		{
			// http://www.google.com:80
			MysqlDataSource ds = new MysqlDataSource();
			ds.setUrl("jdbc:mysql://localhost:3306/sys");
			ds.setUser("root");
			ds.setPassword("root123");
			Connection connection = ds.getConnection();
			return connection;
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return null;
	}

	private static Connection methodOld()
	{
		Connection connection = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "root123");
			return connection;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		return null;
	}
}