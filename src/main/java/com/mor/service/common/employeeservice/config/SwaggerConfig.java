package com.mor.service.common.employeeservice.config;

import java.sql.Timestamp;
import java.util.Date;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.mor.service.common.employeeservice.controller"))
        .paths(PathSelectors.regex("/.*"))
        .build()
        .apiInfo(apiEndPointsInfo())
        .directModelSubstitute(Timestamp.class, Date.class);
  }

  private ApiInfo apiEndPointsInfo() {
    return new ApiInfoBuilder()
        .title("Employee services for Employee Management")
        .description(
            "Employee service")
        .contact(
            new Contact(
                "Đỗ Quốc Khánh", "https://www.fb.com/quockhanh243", "quockhanh2403@gmail.com"))
        .license("Đỗ Quốc Khánh - Dư Dụ - Thanh Thùy - Thanh Oai - Hà Nội")
        .licenseUrl("https://www.fb.com/quockhanh243")
        .version("1.0.0")
        .build();
  }
}