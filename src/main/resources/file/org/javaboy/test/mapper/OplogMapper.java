package org.javaboy.test.mapper;

import org.javaboy.test.model.Oplog;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface OplogMapper{
    List<Oplog> getAllOplogs();
}