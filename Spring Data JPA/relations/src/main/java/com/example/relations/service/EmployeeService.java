package com.example.relations.service;

import com.example.relations.model.Employee;
import com.example.relations.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    @Transactional
    public Employee get(int id){
        return employeeRepository.findById(id).orElse(null);
    }
    @Transactional
    public void save(Employee employee){
        employeeRepository.save(employee);
    }
}
