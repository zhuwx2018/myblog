package com.mybatisex.myblog.mapper;

import com.mybatisex.myblog.domain.Sysfunction;
import com.mybatisex.myblog.domain.SysfunctionExample;
import com.mybatisex.myblog.util.BaseMapper;
import java.util.List;
import java.util.Map;

import com.mybatisex.myblog.view.Menu;
import org.apache.ibatis.annotations.Param;

public interface SysfunctionMapper extends BaseMapper<Sysfunction> {
    int countByExample(SysfunctionExample example);

    int deleteByExample(SysfunctionExample example);

    List<Sysfunction> selectByExample(SysfunctionExample example);

    int updateByExampleSelective(@Param("record") Sysfunction record, @Param("example") SysfunctionExample example);

    int updateByExample(@Param("record") Sysfunction record, @Param("example") SysfunctionExample example);

    List<Sysfunction> selectRootMenu(@Param("userId") String userId);

    List<Menu> findByParent(Map<String,Object> params);

}