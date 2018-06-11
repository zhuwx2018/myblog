package com.mybatisex.myblog.config;

import com.mybatisex.myblog.filter.OriginFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/5
 */
@Configuration
public class FilterConfig {
    @Bean
    public OriginFilter originFilter(){
        return new OriginFilter();
    }
    @Bean
    public FilterRegistrationBean registrationBean(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(originFilter());
        registrationBean.setOrder(Integer.MAX_VALUE);
        List<String> list = new ArrayList<>();
        list.add("/*");
        registrationBean.setUrlPatterns(list);
        return registrationBean;
    }
}
