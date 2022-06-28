package com.zensar.ram;
public class Student  implements Comparable<Student>
{
	int roll;
	String name;
	String branch;

	static int nextRoll = 201;
	//	static method
	public static int getNextRoll() {
		return nextRoll;
	}
	static
	{
		nextRoll = 301;
		System.out.println("static data intialized");
	}
	public Student(String name, String branch)
	{
		this.roll = nextRoll;
		nextRoll++;
		this.name = name;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", branch=" + branch + "]";
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public boolean equals(Object ob)
	{
		Student st = (Student) ob;
		if(this.roll == st.roll && this.name.equals(st.name) && 
				this.branch.equals(st.branch))
			return true;
		return false;
	}
	@Override
	public int hashCode()
	{
		return roll;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}