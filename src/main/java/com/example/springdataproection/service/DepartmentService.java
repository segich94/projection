package com.example.springdataproection.service;

import com.example.springdataproection.model.Department;

public interface DepartmentService {
    Department createDepartment(Department department);
    Department getDepartment(Long id);
    Department updateDepartment(Long id, Department department);
    void deleteDepartment(Long id);
}
