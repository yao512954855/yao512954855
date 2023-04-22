package org.javaboy.test.controller;

import org.javaboy.test.model.Employeeremove;
import org.javaboy.test.service.EmployeeremoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class EmployeeremoveController{

    @Autowired
    EmployeeremoveService employeeremoveService;

    @GetMapping("/employeeremoves")
    public List<Employeeremove> getAllEmployeeremoves(){
        return employeeremoveService.getAllEmployeeremoves();
    }
}