package org.javaboy.test.service;

import org.javaboy.test.model.Hr;
import org.javaboy.test.mapper.HrMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class HrService{

    @Autowired
    HrMapper hrMapper;
    public List<Hr> getAllHrs(){
        return hrMapper.getAllHrs();
    }
}