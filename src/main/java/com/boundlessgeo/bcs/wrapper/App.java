package com.boundlessgeo.bcs.wrapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan(basePackages = {"com.auth0.spring.security.api","com.boundlessgeo.bcs.wrapper"})
@EnableAutoConfiguration
@PropertySources({
	  @PropertySource("classpath:application.properties"),
	  @PropertySource("classpath:auth0.properties")
	})
public class App {

	public static void main(final String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}