package com.example.jpa_vs_hibernate.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.example.jpa_vs_hibernate.entity.Employee;

@Repository
public class HibernateEmployeeDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Integer addEmployee(Employee employee) {
        Session session = entityManager.unwrap(Session.class);
        return (Integer) session.save(employee);
    }
}
