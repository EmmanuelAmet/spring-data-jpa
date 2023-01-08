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

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployee(Long empId){
        return employeeRepository.findByEmpId(empId);
    }

    public Employee deleteEmployee(Long empId) {
        return employeeRepository.deleteByEmpId(empId);
    }

    public Employee getEmployeeByName(String name) {
        return employeeRepository.findTopByNameOrderBySalaryDesc(name);
    }
}
