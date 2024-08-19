package com.example.criteriabuilder;

import com.example.criteriabuilder.model.Employee;
import com.example.criteriabuilder.repository.EmployeeRepository;
import org.instancio.Instancio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

import static org.instancio.Select.field;

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
        for (int i = 0; i < 20; i++) {
            employeeList.add(Instancio.of(Employee.class)
                    .generate(field("firstName"), gen -> gen.text().pattern("#C#c#c#c#c#c#c#c#c"))
                    .generate(field("lastName"), gen -> gen.text().pattern("#C#c#c#c#c#c#c#c#c"))
                    .generate(field("phoneNumber"), gen -> gen.text().pattern("09#d#d-#d#d#d#d#d#d#d"))
                    .generate(field("nationalCode"), gen -> gen.text().pattern("0#d#d#d#d#d#d#d#d#d"))
                    .generate(field("email"), gen -> gen.text().pattern("#c#c#c#c-#d#d#d@gmail.com"))
                    .create());
        }
        employeeRepository.saveAll(employeeList);
    }
}
