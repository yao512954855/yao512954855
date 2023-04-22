package org.javaboy.test.service;

import org.javaboy.test.model.Employeeec;
import org.javaboy.test.mapper.EmployeeecMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class EmployeeecService{

    @Autowired
    EmployeeecMapper employeeecMapper;
    public List<Employeeec> getAllEmployeeecs(){
        return employeeecMapper.getAllEmployeeecs();
    }
}