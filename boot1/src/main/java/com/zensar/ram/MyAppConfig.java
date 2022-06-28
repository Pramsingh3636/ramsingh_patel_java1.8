package com.zensar.ram;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("appconfig.properties")
@Component
public class MyAppConfig 
{

	@Value("${mydb.user}")
	private String user;

	@Value ("${mydb.password}")
	private String password;

	public MyAppConfig() {
		super();
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "MyAppConfig [user=" + user + ", password=" + password + "]";
	}
}