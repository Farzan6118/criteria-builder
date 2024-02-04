package com.example.criteriabuilder;

import com.example.criteriabuilder.model.Employee;
import com.example.criteriabuilder.repository.EmployeeRepository;
import org.instancio.Instancio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CriteriaBuilderApplication implements CommandLineRunner {
    private final EmployeeRepository employeeRepository;

    public CriteriaBuilderApplication(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(CriteriaBuilderApplication.class, args);
    }

    @Override
    public void run(String... args) {
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            employeeList.add(Instancio.create(Employee.class));
        }
        employeeRepository.saveAll(employeeList);
    }
}
