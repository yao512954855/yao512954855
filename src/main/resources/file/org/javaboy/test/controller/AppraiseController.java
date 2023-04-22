package org.javaboy.test.controller;

import org.javaboy.test.model.Appraise;
import org.javaboy.test.service.AppraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class AppraiseController{

    @Autowired
    AppraiseService appraiseService;

    @GetMapping("/appraises")
    public List<Appraise> getAllAppraises(){
        return appraiseService.getAllAppraises();
    }
}