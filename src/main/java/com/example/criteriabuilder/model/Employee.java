package com.example.criteriabuilder.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 64)
    private String firstName;
    @Column(length = 64)
    private String lastName;
    @Column(length = 16)
    private String phoneNumber;
    @Column(length = 10)
    private String nationalCode;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime joinDateTime;
    @Column(columnDefinition = "time")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime localTime;
    @Column(columnDefinition = "date")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate localDate;
    @Email
    private String email;
    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    private BigDecimal salary;

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

    public LocalDateTime getJoinDateTime() {
        return joinDateTime;
    }

    public Employee setJoinDateTime(LocalDateTime joinDateTime) {
        this.joinDateTime = joinDateTime;
        return this;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public Employee setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
        return this;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public Employee setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
        return this;
    }

    public @Email String getEmail() {
        return email;
    }

    public Employee setEmail(@Email String email) {
        this.email = email;
        return this;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Employee setSalary(BigDecimal salary) {
        this.salary = salary;
        return this;
    }
}
