package com.mybatisex.myblog.controller.sysmanager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/20
 */
@Controller
@RequestMapping("sysmanager")
public class SysRouter {
    @GetMapping("userManager")
    public String userManager(){
        return "sysmanager/userManager";
    }
}
