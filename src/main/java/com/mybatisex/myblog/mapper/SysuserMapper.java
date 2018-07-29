package com.mybatisex.myblog.mapper;

import com.mybatisex.myblog.domain.Sysuser;
import com.mybatisex.myblog.domain.SysuserVO;
import com.mybatisex.myblog.util.BaseMapper;

import java.util.List;

public interface SysuserMapper extends BaseMapper<Sysuser> {

    public List<Sysuser> selectByVO(SysuserVO vo);
}