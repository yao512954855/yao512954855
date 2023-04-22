package org.javaboy.test.controller;

import org.javaboy.test.model.Position;
import org.javaboy.test.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class PositionController{

    @Autowired
    PositionService positionService;

    @GetMapping("/positions")
    public List<Position> getAllPositions(){
        return positionService.getAllPositions();
    }
}