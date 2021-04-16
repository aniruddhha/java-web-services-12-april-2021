package com.ani.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 *  - what is Swagger ? -> it is API documentation utility.
 *  - How do configure swagger ? -> Add maven dependency and configure the docket api.
 *  - What are different Swagger Annotations ? -> @ApiOperation and @ApiResponse
 *  * */
@Configuration
public class SwgConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}
