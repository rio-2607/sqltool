package com.beautyboss.slogen.sql.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

/**
 * Author : Slogen
 * Date   : 2019/2/23
 */
@Mapper
public interface SQLToolMapper {

    @Select("${expression}")
    List<HashMap<String,Object>> query(@Param("expression") String expression);

}
