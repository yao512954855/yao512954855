package org.javaboy.test.service;

import org.javaboy.test.model.Empsalary;
import org.javaboy.test.mapper.EmpsalaryMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class EmpsalaryService{

    @Autowired
    EmpsalaryMapper empsalaryMapper;
    public List<Empsalary> getAllEmpsalarys(){
        return empsalaryMapper.getAllEmpsalarys();
    }
}