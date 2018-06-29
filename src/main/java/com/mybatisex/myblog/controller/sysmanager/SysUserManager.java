package com.mybatisex.myblog.controller.sysmanager;

import com.mybatisex.myblog.domain.Sysuser;
import com.mybatisex.myblog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/20
 */
@RestController
@RequestMapping("sysmanager")
public class SysUserManager {
    @Autowired
    private SysUserService userService;
    @RequestMapping("listUser")
    public Object listUser(@RequestParam(name = "pageNum",defaultValue = "1") Integer pageNum, @RequestParam(name = "pageSize",defaultValue = "10")Integer pageSize){
        return userService.selectSysUserPage(pageNum,pageSize);
    }
}
