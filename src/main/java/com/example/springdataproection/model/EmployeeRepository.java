package com.example.springdataproection.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<EmployeeProjection> findEmployeeProjection(Long id);
}
