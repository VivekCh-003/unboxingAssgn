package com.example.unboxingAssgn.repository;

import com.example.unboxingAssgn.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Employee findByUsername(String username);
}
