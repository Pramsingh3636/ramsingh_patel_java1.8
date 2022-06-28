package com.zensar.ram;

class StaticDemoStudent {
	public static void main(String[] args) {

		Student s1 = new Student("Ramsingh", "CSE");
		Student s2 = new Student("Harish", "CSE");
		Student s3 = new Student("Ganesh", "CSE");

		for(int i = 1; i<= 5; i++) {

			Student s = new Student("Ram", "katni");
			System.out.println(s);

		}
		s1.toString();
		s2.toString();
		s3.toString();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);


	}

}
