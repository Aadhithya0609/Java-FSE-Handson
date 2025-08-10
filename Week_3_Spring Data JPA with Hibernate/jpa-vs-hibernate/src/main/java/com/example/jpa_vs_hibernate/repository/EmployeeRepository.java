package com.example.jpa_vs_hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa_vs_hibernate.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {}
