package com.example.jpa_vs_hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.jpa_vs_hibernate.entity.Employee;
import com.example.jpa_vs_hibernate.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/hibernate")
    public String addHibernate(@RequestBody Employee emp) {
        Integer id = service.addEmployeeHibernate(emp);
        return "Employee added with Hibernate: ID = " + id;
    }

    @PostMapping("/springdata")
    public String addSpringData(@RequestBody Employee emp) {
        service.addEmployeeSpringData(emp);
        return "Employee added with Spring Data JPA";
    }
}
