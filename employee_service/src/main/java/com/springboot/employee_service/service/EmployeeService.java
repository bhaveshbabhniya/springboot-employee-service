package com.springboot.employee_service.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.springboot.employee_service.model.Employee;
import com.springboot.employee_service.repository.EmployeeRepository;

import jakarta.validation.Valid;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Page<Employee> getAllEmployees(Pageable pageable){
		return employeeRepository.findAll(pageable);
	}
	
	public Optional<Employee> getEmployeeById(Long id){
		return employeeRepository.findById(id);
	}
	
	public Employee createEmployee(@Valid Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public Employee updateEmployee(Long id, @Valid Employee employeeDetails) {
		Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
		employee.setName(employeeDetails.getName());
		employee.setPosition(employeeDetails.getPosition());
		employee.setSalary(employeeDetails.getSalary());
		return employeeRepository.save(employee);
	}
	
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}
	
	public Page<Employee> searchEmployeesByName(String name, Pageable pageable){
		return employeeRepository.findByNameContaining(name, pageable);
	}
}
