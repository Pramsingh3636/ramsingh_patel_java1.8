package com.zensar.ram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zensar.ram.service.LibraryService;

@SpringBootApplication
public class Boot1Application implements ApplicationRunner , CommandLineRunner
{

	@Autowired
	private LibraryService libService;

	@Value("${myfiles.textfiles.dir}")
	String dir;

	@Value("${server.port}")
	String port;


	public static void main(String[] args) {
		SpringApplication.run(Boot1Application.class, args);
	}

	@Autowired
	private MyAppConfig myAppConfig;

	@Autowired
	private MyDbProps dbprops;

	public void run(ApplicationArguments args) throws Exception 
	{
		MyAppConfig config = new MyAppConfig();
		System.out.println("config = " + config);
		System.out.println(myAppConfig);
		
		MyDbProps props = new MyDbProps();
		System.out.println("props = " + props);
		System.out.println(dbprops);
	}

	//	@Override
	//	public void run(ApplicationArguments args) throws Exception
	//	{
	//		System.out.println("Application runner is running");
	//		System.out.println("the object" + libService);
	//
	//		String libraryName = libService.getLibraryName();
	//		System.out.println(libraryName);
	//		System.out.println("text files dir = " + dir);
	//		System.out.println("port no = " + port);
	//	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("In command");		
	}

}









