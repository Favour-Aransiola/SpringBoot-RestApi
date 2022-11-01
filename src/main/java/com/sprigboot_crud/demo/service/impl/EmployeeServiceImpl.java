package com.sprigboot_crud.demo.service.impl;

import com.sprigboot_crud.demo.model.Employee;
import com.sprigboot_crud.demo.repository.EmployeeRepository;
import com.sprigboot_crud.demo.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
