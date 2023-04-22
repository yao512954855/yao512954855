package org.javaboy.test.mapper;

import org.javaboy.test.model.Hr3;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface Hr3Mapper{
    List<Hr3> getAllHr3s();
}