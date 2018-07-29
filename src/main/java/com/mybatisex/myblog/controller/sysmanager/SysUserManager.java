package com.mybatisex.myblog.controller.sysmanager;

import com.mybatisex.myblog.common.ServerResponse;
import com.mybatisex.myblog.domain.Sysuser;
import com.mybatisex.myblog.domain.SysuserVO;
import com.mybatisex.myblog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @PostMapping("listUser")
    public Object listUser(@RequestBody SysuserVO sysuserVO){
        return userService.selectBySysuserVo(sysuserVO);
    }

//    public Object listUser(@RequestParam(name = "pageNum",defaultValue = "1") Integer pageNum, @RequestParam(name = "pageSize",defaultValue = "10")Integer pageSize){
//        return userService.selectSysUserPage(pageNum,pageSize);
//    }
    @PostMapping("update")
    public Object update(@RequestBody Sysuser sysuser){
        System.out.println(sysuser.getDescription());
        userService.updateSelect(sysuser);
        Map<String,Object> map = new HashMap<>();
        map.put("code","1");
        return map;
    }

    @PostMapping("new")
    public Object newUser(@RequestBody Sysuser sysuser){
        userService.saveUser(sysuser);
        return ServerResponse.createBySuccess();
    }
}
