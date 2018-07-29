package com.mybatisex.myblog.service;

import com.github.pagehelper.PageInfo;
import com.mybatisex.myblog.domain.Sysuser;
import com.mybatisex.myblog.domain.SysuserVO;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/21
 */
public interface SysUserService {
    public PageInfo<Sysuser> selectSysUserPage(Integer pageNum, Integer pageSize);
    public void updateSelect(Sysuser sysuser);
    public PageInfo<Sysuser> selectBySysuserVo(SysuserVO sysuserVO);
    public Sysuser saveUser(Sysuser sysuser);
}
