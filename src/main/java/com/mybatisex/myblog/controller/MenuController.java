package com.mybatisex.myblog.controller;

import com.mybatisex.myblog.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/16
 */
@RestController
@RequestMapping("menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @GetMapping("init")
    public Object init(){
        return menuService.initMenu();
    }
}
