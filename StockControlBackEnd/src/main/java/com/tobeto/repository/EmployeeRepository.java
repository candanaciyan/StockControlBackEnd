package com.tobeto.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tobeto.entity.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, UUID>{
	Optional<Employee> findByEmployeeName(String employeeName);
}
