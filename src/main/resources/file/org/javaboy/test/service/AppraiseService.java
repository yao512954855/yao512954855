package org.javaboy.test.service;

import org.javaboy.test.model.Appraise;
import org.javaboy.test.mapper.AppraiseMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class AppraiseService{

    @Autowired
    AppraiseMapper appraiseMapper;
    public List<Appraise> getAllAppraises(){
        return appraiseMapper.getAllAppraises();
    }
}