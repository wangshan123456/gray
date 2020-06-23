package com.example.serverb.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author shanwang
 * @version 1.0.0
 * @descrition TODO
 * @date 2020/6/21 13:31
 */
@Configuration
@EnableSwagger2
public class Swagger2Configuration {
    /** api接口包扫描路径 */
    public static final String SWAGGER_SCAN_BASE_PACKAGE = "com.example.serverb.controller";

    public static final String VERSION = "1.0.0";

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(SWAGGER_SCAN_BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("swagger-Test")
                .description("swagger 功能测试")
                .version(VERSION)
                .termsOfServiceUrl("http://www.test.com")
                .build();
    }
}
