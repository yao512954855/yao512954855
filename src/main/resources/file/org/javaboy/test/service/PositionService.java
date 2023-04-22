package org.javaboy.test.service;

import org.javaboy.test.model.Position;
import org.javaboy.test.mapper.PositionMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class PositionService{

    @Autowired
    PositionMapper positionMapper;
    public List<Position> getAllPositions(){
        return positionMapper.getAllPositions();
    }
}