package org.javaboy.test.service;

import org.javaboy.test.model.Politicsstatus;
import org.javaboy.test.mapper.PoliticsstatusMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class PoliticsstatusService{

    @Autowired
    PoliticsstatusMapper politicsstatusMapper;
    public List<Politicsstatus> getAllPoliticsstatuss(){
        return politicsstatusMapper.getAllPoliticsstatuss();
    }
}