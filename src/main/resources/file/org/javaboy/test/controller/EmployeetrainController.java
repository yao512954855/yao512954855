package org.javaboy.test.controller;

import org.javaboy.test.model.Employeetrain;
import org.javaboy.test.service.EmployeetrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class EmployeetrainController{

    @Autowired
    EmployeetrainService employeetrainService;

    @GetMapping("/employeetrains")
    public List<Employeetrain> getAllEmployeetrains(){
        return employeetrainService.getAllEmployeetrains();
    }
}