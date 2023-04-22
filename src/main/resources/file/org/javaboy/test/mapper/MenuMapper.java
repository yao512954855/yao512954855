package org.javaboy.test.mapper;

import org.javaboy.test.model.Menu;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface MenuMapper{
    List<Menu> getAllMenus();
}