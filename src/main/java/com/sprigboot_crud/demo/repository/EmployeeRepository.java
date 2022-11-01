package com.sprigboot_crud.demo.repository;

import com.sprigboot_crud.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
