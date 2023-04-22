package org.javaboy.test.service;

import org.javaboy.test.model.FlywaySchemaHistory;
import org.javaboy.test.mapper.FlywaySchemaHistoryMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class FlywaySchemaHistoryService{

    @Autowired
    FlywaySchemaHistoryMapper flywaySchemaHistoryMapper;
    public List<FlywaySchemaHistory> getAllFlywaySchemaHistorys(){
        return flywaySchemaHistoryMapper.getAllFlywaySchemaHistorys();
    }
}