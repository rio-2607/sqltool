package com.beautyboss.slogen.sql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author : Slogen
 * Date   : 2019/2/23
 */
@Controller
public class ToolMainController {

    @RequestMapping("/sql")
    public String admin() {
        return "tool";
    }

}
