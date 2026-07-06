package com.example.relations.service;

import com.example.relations.model.Department;
import com.example.relations.repository.DepartmentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;
    public DepartmentService(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }
    @Transactional
    public Department get(int id){
        return departmentRepository.findById(id).orElse(null);
    }
    @Transactional
    public void save(Department department){
        departmentRepository.save(department);
    }
}
