package com.emmanuelamet.springdatajpa.service;

import com.emmanuelamet.springdatajpa.model.Employee;
import com.emmanuelamet.springdatajpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> createEmployeeData(List<Employee> employeeList) {
        return employeeRepository.saveAll(employeeList);
    }
}
