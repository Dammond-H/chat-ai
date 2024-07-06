package com.damm.admin.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author 黄林强
 * @ClassName SwaggerConfig
 * @description: TODO
 * @date 2024年03月03日
 * @version: 1.0
 */
@Profile("!prod")
@Configuration
public class SwaggerConfig {

    @Value("swagger.host:http://localhost:8081/")
    private String host;

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(new ApiInfoBuilder().title("chatgpt后台管理接口文档").version("v1.0").build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.damm.admin.controller"))
                .build()
                .host(host);
    }

}
