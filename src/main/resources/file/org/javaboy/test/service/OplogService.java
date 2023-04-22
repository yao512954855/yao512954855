package org.javaboy.test.service;

import org.javaboy.test.model.Oplog;
import org.javaboy.test.mapper.OplogMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class OplogService{

    @Autowired
    OplogMapper oplogMapper;
    public List<Oplog> getAllOplogs(){
        return oplogMapper.getAllOplogs();
    }
}