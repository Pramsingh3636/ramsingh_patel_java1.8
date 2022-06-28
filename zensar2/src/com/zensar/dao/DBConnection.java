package com.zensar.dao;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DBConnection
{
	
	private static Connection connection = null;
	
	public static Connection getConnection()
	{
		try
		{
			if(connection != null && ! connection.isClosed())
				return connection;
			// http://www.google.com:80
			//create a new connection and return it
			MysqlDataSource ds = new MysqlDataSource();
			ds.setUrl("jdbc:mysql://localhost:3306/sys");
			ds.setUser("root");
			ds.setPassword("root123");
			DBConnection.connection = ds.getConnection();
			return connection;
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return null;
	}

}