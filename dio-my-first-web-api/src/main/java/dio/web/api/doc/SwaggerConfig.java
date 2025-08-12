package dio.web.api.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableSwagger2 REMOVENDO PARA USAR O OPENAPI
public class SwaggerConfig {
//    private Contact contact() {
//        return new Contact(
//                "DIO",
//                "https://github.com/DevSuperior/dio-spring-boot",
//                "xKk9S@example.com"
//        );
//    }
//
//    private ApiInfoBuilder apiInfo() {
//        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
//        apiInfoBuilder.title("Title - Rest API");
//        apiInfoBuilder.description("API exemplo de uso de Springboot REST API");
//        apiInfoBuilder.version("1.0");
//        apiInfoBuilder.termsOfServiceUrl("https://github.com/DevSuperior/dio-spring-boot");
//        apiInfoBuilder.license("Apache License Version 2.0");
//        apiInfoBuilder.licenseUrl("https://github.com/DevSuperior/dio-spring-boot/blob/master/LICENSE");
//        apiInfoBuilder.contact(this.contact());
//        return apiInfoBuilder;
//    }
//
//    @Bean
//    public Docket detalheAPI() {
//        Docket docket = new Docket(DocumentationType.SWAGGER_2);
//        docket
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("dio.web.api.controller"))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(this.apiInfo().build())
//                .consumes(new HashSet<String>(List.of("application/json")))
//                .produces(new HashSet<String>(List.of("application/json")));
//        return docket;
//    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Title - Rest API")
                        .description("API exemplo de uso de Spring Boot REST API")
                        .version("1.0")
                        .termsOfService("https://github.com/DevSuperior/dio-spring-boot")
                        .license(new License()
                                .name("Apache License Version 2.0")
                                .url("https://github.com/DevSuperior/dio-spring-boot/blob/master/LICENSE"))
                        .contact(new Contact()
                                .name("DIO")
                                .url("https://github.com/DevSuperior/dio-spring-boot")
                                .email("xKk9S@example.com")
                        )
                );
    }
}
