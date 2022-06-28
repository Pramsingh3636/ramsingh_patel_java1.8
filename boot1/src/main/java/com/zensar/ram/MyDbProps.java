package com.zensar.ram;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("appconfig.properties")
@ConfigurationProperties(prefix = "mydb")

public class MyDbProps {

	private String user;
	private String password;
	private String url;

	
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "MyDbProps [user=" + user + ", password=" + password + ", url=" + url + "]";
	}

}
