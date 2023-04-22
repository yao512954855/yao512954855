package org.javaboy.test.service;

import org.javaboy.test.model.Msgcontent;
import org.javaboy.test.mapper.MsgcontentMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class MsgcontentService{

    @Autowired
    MsgcontentMapper msgcontentMapper;
    public List<Msgcontent> getAllMsgcontents(){
        return msgcontentMapper.getAllMsgcontents();
    }
}