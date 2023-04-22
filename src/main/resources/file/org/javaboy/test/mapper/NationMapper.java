package org.javaboy.test.mapper;

import org.javaboy.test.model.Nation;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface NationMapper{
    List<Nation> getAllNations();
}