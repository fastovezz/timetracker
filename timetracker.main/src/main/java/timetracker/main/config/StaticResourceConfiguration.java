package timetracker.main.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class StaticResourceConfiguration implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        addCommonResourcesMapping(registry);
    }

    public static void addCommonResourcesMapping(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/swagger-ui.html").setCacheControl(
                CacheControl.noCache());
    }
}
