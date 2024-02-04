package com.example.criteriabuilder.repository;

import com.example.criteriabuilder.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
