package com.mybatisex.myblog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatisex.myblog.domain.Sysuser;
import com.mybatisex.myblog.domain.SysuserVO;
import com.mybatisex.myblog.mapper.SysuserMapper;
import com.mybatisex.myblog.service.SysUserService;
import com.mybatisex.myblog.util.security.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.mapperhelper.MapperHelper;
import tk.mybatis.mapper.provider.ExampleProvider;

import javax.swing.plaf.PanelUI;
import java.util.Date;
import java.util.List;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/21
 */
@Service
@Transactional
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysuserMapper sysuserMapper;

    public PageInfo<Sysuser> selectSysUserPage(Integer pageNum,Integer pageSize){

        Example example = new Example(Sysuser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andGreaterThanOrEqualTo("operatetime",null);
        criteria.andLessThanOrEqualTo("operatetime",null);

        PageHelper.startPage(pageNum,pageSize);
        PageInfo<Sysuser> pageInfo = new PageInfo<>(sysuserMapper.selectByExample(example));
        return pageInfo;
    }

    public void updateSelect(Sysuser sysuser){
        sysuserMapper.updateByPrimaryKeySelective(sysuser);
    }

    public PageInfo<Sysuser> selectBySysuserVo(SysuserVO sysuserVO){
        // 设置分页 并且设置默认值
        PageHelper.startPage(sysuserVO.getPageNum()==null? 1:sysuserVO.getPageNum(),sysuserVO.getPageSize()==null ?10:sysuserVO.getPageSize());
        PageInfo<Sysuser> pageInfo = new PageInfo<>(sysuserMapper.selectByVO(sysuserVO));
        return pageInfo;
    };

    public Sysuser saveUser(Sysuser sysuser){
        try {
            sysuser.setPasswd(Md5Util.md5(sysuser.getPasswd()));
            sysuser.setOperatetime(new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }
        sysuserMapper.insert(sysuser);
        return sysuser;
    }


}
