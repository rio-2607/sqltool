package com.beautyboss.slogen.sql.dto;

import java.util.List;

/**
 * Author : Slogen
 * Date   : 2019/2/23
 */
public class SQLExecutionDTO {

    private List<String> header;

    private List<List<Object>> results;

    public List<String> getHeader() {
        return header;
    }

    public SQLExecutionDTO setHeader(List<String> header) {
        this.header = header;
        return this;
    }

    public List<List<Object>> getResults() {
        return results;
    }

    public SQLExecutionDTO setResults(List<List<Object>> results) {
        this.results = results;
        return this;
    }

}
