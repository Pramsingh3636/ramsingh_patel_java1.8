package com.zensar.file;

import java.io.File;
import java.sql.Date;
import java.util.Arrays;

public class FileInfo {

	public static void main(String[] args) {
		
		File dir = new File(".");
		System.out.println(dir.getAbsolutePath());
		System.out.println(Arrays.toString(dir.list()));
		
		File file = new File("marks.txt");
		System.out.println(file.exists());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length());
		System.out.println(file.isFile());
		
		long lastModified = file.lastModified(); //milliSeconds
		System.out.println(new Date(lastModified));
		System.out.println();
		

	}

}
