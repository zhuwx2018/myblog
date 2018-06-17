package com.mybatisex.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/16
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
