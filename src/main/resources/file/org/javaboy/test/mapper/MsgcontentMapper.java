package org.javaboy.test.mapper;

import org.javaboy.test.model.Msgcontent;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface MsgcontentMapper{
    List<Msgcontent> getAllMsgcontents();
}