package com.mybatisex.myblog.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/5
add_header Access-Control-Allow-Methods *;
add_header Access-Control-Max-Age 3600;
add_header Access-Control-Allow-Credentials true;
add_header Access-Control-Allow-Origin $http_origin;
add_header Access-Control-Allow-Headers $http_access_control_request_headers;

if ($request_method = OPTIONS){
return 200;
}
 */
public class OriginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse)response;
        HttpServletRequest req = (HttpServletRequest)request;
        String origin = req.getRequestURL().toString();
        System.out.println(origin);
        System.out.println(req.getQueryString());
        System.out.println(req.getRemoteUser());
        res.addHeader("Access-Control-Allow-Methods","*");
        res.addHeader("Access-Control-Max-Age","3600");
        res.addHeader("Access-Control-Allow-Credentials","true");
        res.addHeader("Access-Control-Allow-Origin","*");
        res.addHeader("Access-Control-Allow-Headers","content-type");
        chain.doFilter(req,res);
    }

    @Override
    public void destroy() {

    }
}
