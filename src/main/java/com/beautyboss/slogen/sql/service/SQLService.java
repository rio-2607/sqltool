package com.beautyboss.slogen.sql.service;

import com.beautyboss.slogen.sql.mapper.SQLToolMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Author : Slogen
 * Date   : 2019/2/23
 */
@Service
public class SQLService {

    @Resource
    private SQLToolMapper sqlToolMapper;

    public List<HashMap<String, Object>> executeSQL(String expression) {
        String sql = expression.replaceAll("'","");
        try {
            return sqlToolMapper.query(sql);
        } catch (Exception e) {
        }
        return new ArrayList<>();
    }

}
