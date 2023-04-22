package org.javaboy.test.controller;

import org.javaboy.test.model.MailSendLog;
import org.javaboy.test.service.MailSendLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class MailSendLogController{

    @Autowired
    MailSendLogService mailSendLogService;

    @GetMapping("/mailsendlogs")
    public List<MailSendLog> getAllMailSendLogs(){
        return mailSendLogService.getAllMailSendLogs();
    }
}