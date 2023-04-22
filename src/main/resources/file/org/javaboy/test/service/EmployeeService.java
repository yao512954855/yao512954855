package org.javaboy.test.service;

import org.javaboy.test.model.Employee;
import org.javaboy.test.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class EmployeeService{

    @Autowired
    EmployeeMapper employeeMapper;
    public List<Employee> getAllEmployees(){
        return employeeMapper.getAllEmployees();
    }
}