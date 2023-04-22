package org.javaboy.test.service;

import org.javaboy.test.model.Sysmsg;
import org.javaboy.test.mapper.SysmsgMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class SysmsgService{

    @Autowired
    SysmsgMapper sysmsgMapper;
    public List<Sysmsg> getAllSysmsgs(){
        return sysmsgMapper.getAllSysmsgs();
    }
}