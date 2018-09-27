package com.oneeth.game.doc;

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
 * @author weiyu1990520@163.com
 * @description
 * @create 2018/6/30 11:57
 * @since 1.0.0
 */
@Configuration
@EnableSwagger2
public class DocConfig {
   
    @Bean
    public Docket createOneEthRestApi() {
    	return new Docket(DocumentationType.SWAGGER_2)
    			.apiInfo(apiInfo())
    			.enableUrlTemplating(false)
    			.select()
    			.apis(RequestHandlerSelectors.basePackage("com.oneeth.game"))
    			.paths(PathSelectors.any())
    			.build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("OneEth RESTful APIs")
                .description("OneEth RESTful APIs")
                .termsOfServiceUrl("")
                .contact("fengyaojie@fbee.one")
                .version("1.0")
                .build();
    }
}