package com.zensar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>
{

}
