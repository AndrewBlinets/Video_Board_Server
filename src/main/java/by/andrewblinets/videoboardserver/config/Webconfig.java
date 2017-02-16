package by.andrewblinets.videoboardserver.config;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import java.util.Collections;
import java.util.List;

/**
 * Created by Андрей on 10.02.2017.
 */

@Configuration
@EnableWebMvc
@ComponentScan("by.andrewblinets.videoboardserver")
public class Webconfig extends WebMvcConfigurerAdapter {


        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
        }

        @Override
        public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
            MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
            converter.setObjectMapper(new ObjectMapper());
            converter.setSupportedMediaTypes(Collections.singletonList(MediaType.APPLICATION_JSON));

            converters.add(converter);
        }


        @Bean
        public UrlBasedViewResolver setupViewResolver() {
            UrlBasedViewResolver resolver = new UrlBasedViewResolver();
            resolver.setPrefix("/pages/");
            resolver.setSuffix(".jsp");
            resolver.setViewClass(JstlView.class);

            return resolver;
        }

}
