package com.mintic.boutique;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BoutiqueApplication {

    @Bean
    public Docket boutiqueApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
                }

    public static void main(String[] args) {
        SpringApplication.run(BoutiqueApplication.class, args);
    }

}
/*server.port=8082
spring.data.mongodb.database=Boutique
spring.data.mongodb.uri=mongodb+srv://omar:omar@cluster0.8g3bu.mongodb.net/Boutique?retryWrites=true&w=majority
*/