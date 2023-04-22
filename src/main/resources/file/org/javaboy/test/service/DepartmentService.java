package org.javaboy.test.service;

import org.javaboy.test.model.Department;
import org.javaboy.test.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class DepartmentService{

    @Autowired
    DepartmentMapper departmentMapper;
    public List<Department> getAllDepartments(){
        return departmentMapper.getAllDepartments();
    }
}