package org.javaboy.test.mapper;

import org.javaboy.test.model.Hr2;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface Hr2Mapper{
    List<Hr2> getAllHr2s();
}