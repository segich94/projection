package com.example.springdataproection.service;

import com.example.springdataproection.model.Department;
import com.example.springdataproection.model.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService{
    private final DepartmentRepository departmentRepository;
    @Override
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartment(Long id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public Department updateDepartment(Long id, Department department) {
        Department oldDepartment = getDepartment(id);
        oldDepartment.setName(department.getName());
        return departmentRepository.save(oldDepartment);
    }

    @Override
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}
