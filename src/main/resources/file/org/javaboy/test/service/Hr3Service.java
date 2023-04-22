package org.javaboy.test.service;

import org.javaboy.test.model.Hr3;
import org.javaboy.test.mapper.Hr3Mapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class Hr3Service{

    @Autowired
    Hr3Mapper hr3Mapper;
    public List<Hr3> getAllHr3s(){
        return hr3Mapper.getAllHr3s();
    }
}