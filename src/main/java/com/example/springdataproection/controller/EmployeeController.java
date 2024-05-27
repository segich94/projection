package com.example.springdataproection.controller;

import com.example.springdataproection.model.Employee;
import com.example.springdataproection.model.EmployeeProjection;
import com.example.springdataproection.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee/")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @PatchMapping("/{id}")
    public Employee update(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
    @GetMapping("/{id}/full")
    public Employee getFullInfo(@PathVariable Long id){
        return employeeService.getEmployee(id);
    }

    @GetMapping("/{id}")
    public EmployeeProjection get(@PathVariable Long id) {
        return employeeService.getShortInfoEmployee(id);
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }


}
