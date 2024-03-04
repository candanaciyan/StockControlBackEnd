package com.tobeto.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;


import com.tobeto.entity.Employee;
import com.tobeto.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	

	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	public Employee findById(UUID id) {
		Optional<Employee> employeeOptional = employeeRepository.findById(id);
		return employeeOptional.orElse(null);
	}
	
	public void deleteEmployee(UUID id) {
		employeeRepository.deleteById(id);
	}
	

	//public Employee findByEmployeeName(String employeeName) {
		//Optional<Employee> employeeOptional = employeeRepository.findByEmployeeName(employeeName);
		//return employeeOptional.orElse(null);
	//}
	
	
	
}
