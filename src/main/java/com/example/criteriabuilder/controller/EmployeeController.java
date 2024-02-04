package com.example.criteriabuilder.controller;

import com.example.criteriabuilder.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {
    private final EmployeeService employeeService;

    Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("testOne")
    public List<Object> testOne() {
        logger.info("Select all records");
        return employeeService.criteriaSampleOne();
    }

    @GetMapping("testTwo")
    public List<Object> testTwo() {
        logger.info("Select all records by salary order");
        return employeeService.criteriaSampleTwo();
    }
}
