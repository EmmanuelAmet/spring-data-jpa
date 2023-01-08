package com.emmanuelamet.springdatajpa.repository;

import com.emmanuelamet.springdatajpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByEmpId(Long id);
}
