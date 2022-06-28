package com.zensar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zensar.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{
	//Spring data Jpa naming rules
	public List<Employee> findByName(String name);
	
	//HQL QUERY : OBJECTS
	//Hibernate will convert HQL Query to SQL Query and run
	@Query(value = "select e from Employee e where e.departments null")
	public List<Employee> findWithNullDept(); //did not follow rules of Spring data jpa
	
	@Query (nativeQuery = true, value = " select * from employee where depid is null")
	public List<Employee> findWithNullDeptNative(); //did not follow rules of Spring data jpa

}