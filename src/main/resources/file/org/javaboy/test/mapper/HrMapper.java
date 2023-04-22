package org.javaboy.test.mapper;

import org.javaboy.test.model.Hr;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface HrMapper{
    List<Hr> getAllHrs();
}