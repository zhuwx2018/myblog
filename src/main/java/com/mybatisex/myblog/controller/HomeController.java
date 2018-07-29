package com.mybatisex.myblog.controller;

import com.mybatisex.myblog.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/16
 */
@Controller
public class HomeController {
    @Autowired
    private UserInfoService service;

    private String username;
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/main")
    public String main(){
        return "main";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/test_login/{time}")
    public String loginTime(@PathVariable(name = "time") String time) throws InterruptedException {
        System.out.println(time+":"+username);
        if(time.equals("stop")){
            username = "hello world";

            Thread.sleep(5000);
        }
        System.out.println(time);
        return "login";
    }
}
