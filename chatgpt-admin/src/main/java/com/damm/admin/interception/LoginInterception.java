package com.damm.admin.interception;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author 黄林强
 * @ClassName LoginInterception
 * @description: TODO
 * @date 2024年03月02日
 * @version: 1.0
 */
@Slf4j
@Component
public class LoginInterception implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 配置跨域
        String origin = request.getHeader("Origin");
        log.info("Origin: {}", origin);
        if(StringUtils.isNotBlank(origin)) {
            response.addHeader("Access-Control-Allow-Origin", origin);
        }
        response.setHeader("Access-Control-Allow-Headers", "access-control-allow-origin, authority, content-type, version-info, X-Requested-With");
        response.setHeader("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, DELETE, TRACE, OPTIONS, PATCH");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Max-Age", "3600");
//        response.addHeader("Access-Control-Max-Age", "3600");
//        if (request.getMethod().toLowerCase(Locale.ROOT).equals("options")) {
//            return true;
//        }
        return true;
    }
}
