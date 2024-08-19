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


}
