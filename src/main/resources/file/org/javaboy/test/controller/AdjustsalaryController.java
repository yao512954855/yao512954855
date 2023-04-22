package org.javaboy.test.controller;

import org.javaboy.test.model.Adjustsalary;
import org.javaboy.test.service.AdjustsalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class AdjustsalaryController{

    @Autowired
    AdjustsalaryService adjustsalaryService;

    @GetMapping("/adjustsalarys")
    public List<Adjustsalary> getAllAdjustsalarys(){
        return adjustsalaryService.getAllAdjustsalarys();
    }
}