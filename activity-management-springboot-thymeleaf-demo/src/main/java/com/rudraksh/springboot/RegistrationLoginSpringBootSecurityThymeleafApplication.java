package com.rudraksh.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RegistrationLoginSpringBootSecurityThymeleafApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(RegistrationLoginSpringBootSecurityThymeleafApplication.class, args);
	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RegistrationLoginSpringBootSecurityThymeleafApplication.class);
    }

}
