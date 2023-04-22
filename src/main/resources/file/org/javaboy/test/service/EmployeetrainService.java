package org.javaboy.test.service;

import org.javaboy.test.model.Employeetrain;
import org.javaboy.test.mapper.EmployeetrainMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class EmployeetrainService{

    @Autowired
    EmployeetrainMapper employeetrainMapper;
    public List<Employeetrain> getAllEmployeetrains(){
        return employeetrainMapper.getAllEmployeetrains();
    }
}