package org.javaboy.test.controller;

import org.javaboy.test.model.Sysmsg;
import org.javaboy.test.service.SysmsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class SysmsgController{

    @Autowired
    SysmsgService sysmsgService;

    @GetMapping("/sysmsgs")
    public List<Sysmsg> getAllSysmsgs(){
        return sysmsgService.getAllSysmsgs();
    }
}