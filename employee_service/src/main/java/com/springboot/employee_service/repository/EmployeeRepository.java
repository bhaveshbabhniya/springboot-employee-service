package com.springboot.employee_service.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.employee_service.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	Page<Employee> findByNameContaining(String name, Pageable pageable);
}
