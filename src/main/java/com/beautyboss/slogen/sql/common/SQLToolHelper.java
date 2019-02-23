package com.beautyboss.slogen.sql.common;

import org.springframework.util.StringUtils;

/**
 * Author : Slogen
 * Date   : 2019/2/23
 */
public class SQLToolHelper {

    public static String wrapScannerPath(String path) {
        if(StringUtils.isEmpty(path)) {
            return path;
        }
        if(Const.MAPPER_SCANNER_PATH.equals(path)) {
            return path;
        }
        return path + ";" + Const.MAPPER_SCANNER_PATH;
    }

}
