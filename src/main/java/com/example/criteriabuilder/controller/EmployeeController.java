package com.example.criteriabuilder.controller;

import com.example.criteriabuilder.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("testOne")
    public List<Object> testOne() {
        return employeeService.criteriaSampleOne();
    }

    @GetMapping("testTwo")
    public List<Object> testTwo() {
        return employeeService.criteriaSampleTwo();
    }
}
