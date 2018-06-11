package com.mybatisex.myblog.controller;

import com.mybatisex.myblog.domain.UserTemp;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/5
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping("/login")
    public Object login(@RequestBody UserTemp temp){
        System.out.println(temp);
        System.out.println("访问成功");

        return "hello";
    }
}
