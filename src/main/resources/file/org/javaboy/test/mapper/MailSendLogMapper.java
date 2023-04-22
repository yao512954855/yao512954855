package org.javaboy.test.mapper;

import org.javaboy.test.model.MailSendLog;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface MailSendLogMapper{
    List<MailSendLog> getAllMailSendLogs();
}