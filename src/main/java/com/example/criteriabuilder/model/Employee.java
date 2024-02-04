package com.example.criteriabuilder.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.time.LocalDateTime;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String nationalCode;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime joinDateTime;
    //    @Email
    private String email;
    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    private Double salary;

    public LocalDateTime getJoinDateTime() {
        return joinDateTime;
    }

    public Employee setJoinDateTime(LocalDateTime joinDateTime) {
        this.joinDateTime = joinDateTime;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Employee setEmail(String email) {
        this.email = email;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Employee setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Employee setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Employee setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Employee setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public Employee setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
        return this;
    }

    public Double getSalary() {
        return salary;
    }

    public Employee setSalary(Double salary) {
        this.salary = salary;
        return this;
    }
}
