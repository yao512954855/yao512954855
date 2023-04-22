package org.javaboy.test.service;

import org.javaboy.test.model.Hr2;
import org.javaboy.test.mapper.Hr2Mapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class Hr2Service{

    @Autowired
    Hr2Mapper hr2Mapper;
    public List<Hr2> getAllHr2s(){
        return hr2Mapper.getAllHr2s();
    }
}