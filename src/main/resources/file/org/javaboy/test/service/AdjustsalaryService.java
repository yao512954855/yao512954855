package org.javaboy.test.service;

import org.javaboy.test.model.Adjustsalary;
import org.javaboy.test.mapper.AdjustsalaryMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class AdjustsalaryService{

    @Autowired
    AdjustsalaryMapper adjustsalaryMapper;
    public List<Adjustsalary> getAllAdjustsalarys(){
        return adjustsalaryMapper.getAllAdjustsalarys();
    }
}