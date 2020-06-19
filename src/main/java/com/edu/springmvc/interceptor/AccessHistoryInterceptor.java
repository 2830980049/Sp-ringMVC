package com.edu.springmvc.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AccessHistoryInterceptor implements HandlerInterceptor {
    private Logger logger = LoggerFactory.getLogger(AccessHistoryInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        StringBuilder log = new StringBuilder();
        //获取用户IP
        log.append(request.getRemoteAddr());
        log.append("|");
        //获取用户访问URL地址
        log.append(request.getRequestURI());
        log.append("|");
        //获取用户请求头 - 环境
        log.append(request.getHeader("user-agent"));
        logger.info(log.toString());
        return true;
    }
}
