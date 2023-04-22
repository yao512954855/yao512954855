package org.javaboy.test.service;

import org.javaboy.test.model.MailSendLog;
import org.javaboy.test.mapper.MailSendLogMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class MailSendLogService{

    @Autowired
    MailSendLogMapper mailSendLogMapper;
    public List<MailSendLog> getAllMailSendLogs(){
        return mailSendLogMapper.getAllMailSendLogs();
    }
}