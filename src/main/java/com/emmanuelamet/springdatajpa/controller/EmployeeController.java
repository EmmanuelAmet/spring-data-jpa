package com.emmanuelamet.springdatajpa.controller;

import com.emmanuelamet.springdatajpa.model.Employee;
import com.emmanuelamet.springdatajpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @PostMapping
    public List<Employee> createEmployee(@RequestBody List<Employee> employeeList){
        return employeeService.createEmployeeData(employeeList);
    }

    @GetMapping
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/{empId}")
    public Employee getEmployee(@PathVariable Long empId){
        return employeeService.getEmployee(empId);
    }

    @DeleteMapping("/{empId}")
    public Employee deleteEmployee(@PathVariable Long empId){
        return employeeService.deleteEmployee(empId);
    }

    @GetMapping("/{name}")
    public Employee getEmployeeByName(@PathVariable String name){
        return employeeService.getEmployeeByName(name);
    }
}
