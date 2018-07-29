package com.mybatisex.myblog.mapper;

import com.mybatisex.myblog.domain.Sysfunction;
import com.mybatisex.myblog.domain.SysfunctionExample;
import com.mybatisex.myblog.util.BaseMapper;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mybatisex.myblog.view.Menu;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.Cacheable;

public interface SysfunctionMapper extends BaseMapper<Sysfunction> {
    int countByExample(SysfunctionExample example);

    int deleteByExample(SysfunctionExample example);

    List<Sysfunction> selectByExample(SysfunctionExample example);

    int updateByExampleSelective(@Param("record") Sysfunction record, @Param("example") SysfunctionExample example);

    int updateByExample(@Param("record") Sysfunction record, @Param("example") SysfunctionExample example);

    Set<Sysfunction> selectRootMenu(@Param("userId") String userId);
    
    Set<Menu> findByParent(Map<String,Object> params);

    Set<Menu> selectByParent(Map<String,Object> params);
    @Cacheable(value = "initMenu",key = "#p0",unless = "#result==null")
    Set<Sysfunction> findRootMenu(@Param("userId") String userId);
}