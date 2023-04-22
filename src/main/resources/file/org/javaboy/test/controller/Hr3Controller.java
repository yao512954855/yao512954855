package org.javaboy.test.controller;

import org.javaboy.test.model.Hr3;
import org.javaboy.test.service.Hr3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class Hr3Controller{

    @Autowired
    Hr3Service hr3Service;

    @GetMapping("/hr3s")
    public List<Hr3> getAllHr3s(){
        return hr3Service.getAllHr3s();
    }
}