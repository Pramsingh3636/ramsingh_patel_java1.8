package com.zensar.stream.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Employee {
	int empid;
	String name;
	int exp;
	String address;
	public Employee(int empid, String name, int exp, String address) {
		super();
		this.empid = empid;
		this.name = name;
		this.exp = exp;
		this.address = address;
	}
	public Employee() {
		super();
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", experience=" + exp + ", address=" + address + "]";
	}

}
class EmployeeNotFoundException extends Exception
{

	public EmployeeNotFoundException(String s) {
		super(s);
	}
}
public class EmployeeTest {

	public static void main(String[] args) throws EmployeeNotFoundException {

		//creating a list
		List<Employee> list = new ArrayList<>();

		Employee emp1 = new Employee(101, "Ramsingh", 2, "Jabalpur");
		Employee emp2 = new Employee(102, "Harish", 3, "Katni");
		Employee emp3 = new Employee(103, "Ganesh", 2, "Nasik");
		Employee emp4 = new Employee(104, "Krishna", 1, "Pune");
		Employee emp5 = new Employee(105, "Durgesh", 5, "Bhopal");
		Employee emp6 = new Employee(106, "Dheeraj", 4, "Jabalpur");

		list.add(emp1); list.add(emp2); list.add(emp3);
		list.add(emp4); list.add(emp5); list.add(emp6);
	}

		public static List<Employee> getEmployeeFromCity(List<Employee> list,String city){
			List<Employee> list1=list.stream().filter(c->c.getAddress().equals(city)).collect(Collectors.toList());

			return list1;

		}

		public static Stream<Employee> getEmployeeSortedByName(List<Employee> list){
			Stream<Employee> s = list.stream().sorted(Comparator.comparing(Employee::getName));
			return s;

		}
		public static Employee getEmployee(List<Employee> list,int empid) throws EmployeeNotFoundException {
			for(Employee e : list) {
				if(e.empid==empid) {
					return e;
				}
			}
			throw new EmployeeNotFoundException("Employee Not Found");

		}
	}