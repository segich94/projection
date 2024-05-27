package com.example.springdataproection.controller;

import com.example.springdataproection.model.Department;
import com.example.springdataproection.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/department")
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping("/{id}")
    public Department get(@PathVariable Long id) {
        return departmentService.getDepartment(id);
    }

    @PostMapping
    public void create(@RequestBody Department department) {
        departmentService.createDepartment(department);
    }

    @PatchMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Department department) {
        departmentService.updateDepartment(id, department);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        departmentService.deleteDepartment(id);
    }
}