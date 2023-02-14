package com.example.demoProjectF1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc //Enable SpringMVC
@ComponentScan({"com.example"})
@PropertySource("file:d:/NEW_PROPERTIES/PROPERTIESFILE.properties")
@EnableAspectJAutoProxy
public class WebConfig extends WebMvcConfigurerAdapter{

	
}
