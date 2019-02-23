package com.beautyboss.slogen.sql.common;

import java.util.Arrays;
import java.util.List;

/**
 * Author : Slogen
 * Date   : 2019/2/23
 */
public class Const {

    public static final String MAPPER_SCANNER_PATH = "com.beautyboss.slogen.sql.knife.mapper";

    public static final List<String> FORBIDDEN_ORDER = Arrays.asList("delete","drop","update","insert","alter",
            "grant","create","truncate","mysqldump","mysqladmin","rm","add","dbcc","exec");

}

