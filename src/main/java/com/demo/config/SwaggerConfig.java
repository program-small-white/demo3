package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author LOVE
 * @create 2020/11/9 13:02
 */
@Configuration
@EnableSwagger2
@EnableWebMvc
@ComponentScan(basePackages = "com.demo.controller") //需要扫描的包
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                //生成过滤链接
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }
    private ApiInfo apiInfo() {
        Contact contact=new Contact("于殿阁","http://www.baidu.com","yuge524330244@163.com");
        return new ApiInfoBuilder()
                .title("xxx项目接口文档")
                .description("xxx接口测试")
                .version("1.0.0") //版本号
                .contact(contact)
                .termsOfServiceUrl("")
                .license("") //连接名称
                .licenseUrl("") //连接地址
                .build();
    }
}

