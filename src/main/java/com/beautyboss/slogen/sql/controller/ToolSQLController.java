package com.beautyboss.slogen.sql.controller;

import com.beautyboss.slogen.sql.common.Const;
import com.beautyboss.slogen.sql.dto.SQLExecutionDTO;
import com.beautyboss.slogen.sql.service.SQLService;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;


/**
 * Author : Slogen
 * Date   : 2019/2/23
 */
@RestController
@RequestMapping("/tool")
public class ToolSQLController {

    @Resource
    private SQLService sqlService;

    @GetMapping("/sql")
    public SQLExecutionDTO execute(@RequestParam("sql") String sql) {
        if(StringUtils.isEmpty(sql)) {
            return null;
        }
        List<String> sqls = Arrays.stream(sql.split("\\s+")).map(String::toLowerCase).collect(Collectors.toList());
        if(sql.contains("update") || sql.contains("delete") || sql.contains("drop") || sql.contains("insert")) {
            return null;
        }
        for(String order : Const.FORBIDDEN_ORDER) {
            if(sqls.contains(order)) {
                return null;
            }
        }
        List<HashMap<String,Object>> result = sqlService.executeSQL(sql);
        if(CollectionUtils.isEmpty(result)) {
            return null;
        }
        return transfer(result);
    }

    private SQLExecutionDTO transfer(List<HashMap<String,Object>> result) {
        SQLExecutionDTO dto = new SQLExecutionDTO();
        List<String> headers = new ArrayList<>();
        List<List<Object>> results = new ArrayList<>();

        for(Map<String,Object> data : result) {
            if(CollectionUtils.isEmpty(headers)) {
                headers.addAll(data.keySet());
            }
            List<Object> detail = new ArrayList<>();
            for(String header : headers) {
                detail.add(data.get(header));
            }
            results.add(detail);
        }
        dto.setHeader(headers);
        dto.setResults(results);
        return dto;
    }
}
