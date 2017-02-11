package by.andrewblinets.videoboardserver.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Андрей on 10.02.2017.
 */

@Configuration
@EnableWebMvc
@ComponentScan("by.andrewblinets.videoboardserver")
public class Webconfig extends WebMvcConfigurerAdapter {

}
