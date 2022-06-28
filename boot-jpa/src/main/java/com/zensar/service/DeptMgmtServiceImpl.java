
package com.zensar.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.zensar.model.Department;
import com.zensar.model.Employee;
import com.zensar.repository.DepartmentRepository;
import com.zensar.repository.EmployeeRepository;

@Service
public class DeptMgmtServiceImpl implements DeptMgmtService
{
	@Autowired
	DepartmentRepository deptRepo;
	
	@Autowired
	EmployeeRepository empRepo;
	
	@Autowired
	EntityManager entityManager;
	
	@Override
	public void printEmployeeAndDeptNames() 
	{
		List<Department> deps = deptRepo.findAll();
		for(Department dep : deps)
			System.out.println(dep);
		
		List<Employee> emps = empRepo.findAll();
		for(Employee emp : emps)
			System.out.println(emp);
		
		List<Employee> listName = empRepo.findByName("Ram");
		System.out.println();
		System.out.println("all emps with name Ram");
		System.out.println(listName);
		
		System.out.println();
		List<Employee> listNoDept = empRepo.findWithNullDept();
		listNoDept.forEach(System.out::println);
		
		System.out.println();
		List<Employee> listNoDept2 = empRepo.findWithNullDeptNative();
		listNoDept2.forEach(System.out::println);
		
		System.out.println();
		System.out.println("all emp using named Query");
//		Query namedQuery = entityManager.createNamedQuery("ALLEMP_QUERY");
//		namedQuery.getResultList().forEach(System.out::println);
	}
}
		