package org.javaboy.test.service;

import org.javaboy.test.model.Employeeremove;
import org.javaboy.test.mapper.EmployeeremoveMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class EmployeeremoveService{

    @Autowired
    EmployeeremoveMapper employeeremoveMapper;
    public List<Employeeremove> getAllEmployeeremoves(){
        return employeeremoveMapper.getAllEmployeeremoves();
    }
}