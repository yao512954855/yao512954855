package org.javaboy.test.controller;

import org.javaboy.test.model.Hr2;
import org.javaboy.test.service.Hr2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class Hr2Controller{

    @Autowired
    Hr2Service hr2Service;

    @GetMapping("/hr2s")
    public List<Hr2> getAllHr2s(){
        return hr2Service.getAllHr2s();
    }
}