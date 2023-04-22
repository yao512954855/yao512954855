package org.javaboy.test.mapper;

import org.javaboy.test.model.Joblevel;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface JoblevelMapper{
    List<Joblevel> getAllJoblevels();
}