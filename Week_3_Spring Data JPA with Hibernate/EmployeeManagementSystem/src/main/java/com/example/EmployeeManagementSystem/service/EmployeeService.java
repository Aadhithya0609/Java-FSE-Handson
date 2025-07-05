package com.example.EmployeeManagementSystem.service;

import com.example.EmployeeManagementSystem.model.Employee;
import com.example.EmployeeManagementSystem.repo.EmployeeRepository;
import com.example.EmployeeManagementSystem.dto.EmployeeDTO;
import com.example.EmployeeManagementSystem.projection.EmployeeBasicInfo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void saveEmployeesInBatch(List<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            entityManager.persist(employees.get(i));
            if (i % 30 == 0) {
                entityManager.flush();
                entityManager.clear();
            }
        }
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    public Page<Employee> getPaginatedEmployees(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    public Page<Employee> searchByName(String name, Pageable pageable) {
        return employeeRepository.findByNameContaining(name, pageable);
    }

    public List<Employee> getBasicInfoByDepartment(Long deptId) {
        return employeeRepository.findByDepartmentId(deptId);
    }

    public List<EmployeeDTO> getEmployeeDTOs() {
        return employeeRepository.findAllEmployeeSummaries();
    }
}
