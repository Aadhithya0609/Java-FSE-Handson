package com.example.EmployeeManagementSystem.repo;

import com.example.EmployeeManagementSystem.model.Employee;
import com.example.EmployeeManagementSystem.dto.EmployeeDTO;
import com.example.EmployeeManagementSystem.projection.EmployeeBasicInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByName(String name);
    List<Employee> findByEmailContaining(String keyword);
    List<Employee> findByDepartmentId(Long departmentId);

    @Query("SELECT e FROM Employee e WHERE e.name = :name AND e.email = :email")
    List<Employee> findByNameAndEmailCustom(@Param("name") String name, @Param("email") String email);


    @Query("SELECT new com.example.EmployeeManagementSystem.dto.EmployeeDTO(e.name, e.email, e.department.name) FROM Employee e")
    List<EmployeeDTO> findAllEmployeeSummaries();

    Page<Employee> findAll(Pageable pageable);
    Page<Employee> findByNameContaining(String name, Pageable pageable);
}
