package com.digitalinnovationone.santander.shoppingCart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket swagger(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.digitalinnovationone.santander.shoppingCart"))
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.regex("/*.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo(){
        ApiInfo apiInfo =  new ApiInfo(
                "Gestão de Pessoas",
                "Projeto API REST para gestão de Pessoas",
                "0.0.1",
                "Terms of Service",
                new Contact("Fábio Pereira Reis","" ,"fabiopereirar@hotmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/license.html", new ArrayList<VendorExtension>());
        return apiInfo;
    }
}
