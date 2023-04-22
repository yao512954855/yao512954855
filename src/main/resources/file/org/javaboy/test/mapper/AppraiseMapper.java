package org.javaboy.test.mapper;

import org.javaboy.test.model.Appraise;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface AppraiseMapper{
    List<Appraise> getAllAppraises();
}