package com.damm.admin.config;


import com.damm.admin.interception.LoginInterception;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 黄林强
 * @ClassName WebmvcConfig
 * @description: TODO
 * @date 2024年03月03日
 * @version: 1.0
 */
@Configuration
public class WebmvcConfig implements WebMvcConfigurer {

    @Autowired
    private LoginInterception loginInterception;

    @Value("spring.mvc.excludeUrls:[]")
    private List<String> excludeUrls;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(loginInterception).addPathPatterns("/**");
        for (String url : excludeUrls) {
            interceptorRegistration.excludePathPatterns(url);
        }
    }
}
