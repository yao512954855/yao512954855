package org.javaboy.test.service;

import org.javaboy.test.model.Salary;
import org.javaboy.test.mapper.SalaryMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class SalaryService{

    @Autowired
    SalaryMapper salaryMapper;
    public List<Salary> getAllSalarys(){
        return salaryMapper.getAllSalarys();
    }
}