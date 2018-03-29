package com.quintet.exception;


import com.quintet.config.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice(basePackages = "com.quintet")
public class RestExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(RestExceptionHandler.class.getSimpleName());

    //todo 验证HttpServletRequest中各个属性都有什么
    private void printWarnLogger(Exception e, int errorCode, HttpServletRequest request) {
        String url = "https://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath()
                + request.getServletPath() + "?" + (request.getQueryString() + " header:Authorization=" + request.getHeader(Constants.AUTHORIZATION));
        logger.warn("url:" + url + " 发生" + errorCode + "错误:" + e);
    }





}
