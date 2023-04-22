package org.javaboy.test.mapper;

import org.javaboy.test.model.Sysmsg;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface SysmsgMapper{
    List<Sysmsg> getAllSysmsgs();
}