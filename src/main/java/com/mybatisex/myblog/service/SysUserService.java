package com.mybatisex.myblog.service;

import com.github.pagehelper.PageInfo;
import com.mybatisex.myblog.domain.Sysuser;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/21
 */
public interface SysUserService {
    public PageInfo<Sysuser> selectSysUserPage(Integer pageNum, Integer pageSize);
}
