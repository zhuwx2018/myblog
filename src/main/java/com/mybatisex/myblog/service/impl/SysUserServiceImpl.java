package com.mybatisex.myblog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatisex.myblog.domain.Sysuser;
import com.mybatisex.myblog.mapper.SysuserMapper;
import com.mybatisex.myblog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/21
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysuserMapper sysuserMapper;

    public PageInfo<Sysuser> selectSysUserPage(Integer pageNum,Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        PageInfo<Sysuser> pageInfo = new PageInfo<>(sysuserMapper.selectAll());
        return pageInfo;
    }
}
