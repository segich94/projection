package com.example.springdataproection.service;

import com.example.springdataproection.model.Employee;
import com.example.springdataproection.model.EmployeeProjection;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    Employee getEmployee(Long id);
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
    EmployeeProjection getShortInfoEmployee(Long id);
}
