package com.greens.spring_core_JPA.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greens.spring_core_JPA.model.Employee;


// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository 
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
    
}
