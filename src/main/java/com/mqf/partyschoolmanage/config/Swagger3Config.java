package com.mqf.partyschoolmanage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

/**
 * @author java1234_小锋
 * @site www.java1234.com
 * @company 南通小锋网络科技有限公司
 * @create 2021-09-21 10:42
 */
@Configuration
public class Swagger3Config {

    /**
     * 配置swagger的Docket bean
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30)  // 指定swagger3.0版本
                .groupName("001")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mqf.partyschoolmanage.controller"))  // 指定扫描的包  常用方式
                .build()
                .apiInfo(createApiInfo());
    }

    /**
     * 配置swagger的ApiInfo bean
     * @return
     */
    @Bean
    public ApiInfo createApiInfo(){
        return new ApiInfo("Party School Manage"
                ,"Party School Manage"
                ,"3.0"
                ,""
                ,new Contact("mqf", "", "")
                ,"Apache 2.0"
                ,"http://www.apache.org/licenses/LICENSE-2.0"
                ,new ArrayList());
    }



}