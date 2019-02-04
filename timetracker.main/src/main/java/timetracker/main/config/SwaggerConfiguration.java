package timetracker.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    @Bean
    public Docket utilityPortalApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("full-v1-api")
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(true)
                .pathMapping("/") //base
                .select()
                .paths(regex("(/v1/.*)"))
                .build()
                .apiInfo(testApiInfo());
    }

    private ApiInfo testApiInfo() {
        ApiInfo apiInfo = new ApiInfo("Timetracker RESTful API documentation",
                "Swagger documentation description",
                "1.0",
                "No terms of service",
                new Contact("",
                        "",
                        ""),
                "Apache License 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0"
        );

        return apiInfo;
    }
}
