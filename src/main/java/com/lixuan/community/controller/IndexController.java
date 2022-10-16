package com.lixuan.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author z7
 * @version 1.0
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
