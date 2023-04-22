package org.javaboy.test.controller;

import org.javaboy.test.model.Msgcontent;
import org.javaboy.test.service.MsgcontentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class MsgcontentController{

    @Autowired
    MsgcontentService msgcontentService;

    @GetMapping("/msgcontents")
    public List<Msgcontent> getAllMsgcontents(){
        return msgcontentService.getAllMsgcontents();
    }
}