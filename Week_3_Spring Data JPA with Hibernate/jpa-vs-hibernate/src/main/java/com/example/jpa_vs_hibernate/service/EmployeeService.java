package com.example.jpa_vs_hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa_vs_hibernate.dao.HibernateEmployeeDAO;
import com.example.jpa_vs_hibernate.entity.Employee;
import com.example.jpa_vs_hibernate.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private HibernateEmployeeDAO hibernateDAO;

    @Autowired
    private EmployeeRepository employeeRepository;

    // Hibernate style
    public Integer addEmployeeHibernate(Employee employee) {
        return hibernateDAO.addEmployee(employee);
    }

    // Spring Data JPA style
    @Transactional
    public void addEmployeeSpringData(Employee employee) {
        employeeRepository.save(employee);
    }
}
