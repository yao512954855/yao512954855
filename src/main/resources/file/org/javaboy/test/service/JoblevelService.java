package org.javaboy.test.service;

import org.javaboy.test.model.Joblevel;
import org.javaboy.test.mapper.JoblevelMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class JoblevelService{

    @Autowired
    JoblevelMapper joblevelMapper;
    public List<Joblevel> getAllJoblevels(){
        return joblevelMapper.getAllJoblevels();
    }
}