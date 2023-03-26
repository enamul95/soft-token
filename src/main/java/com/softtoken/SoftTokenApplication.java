package com.softtoken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.softtoken.controller")
@ComponentScan(basePackages = { "com.softtoken.controller" })
public class SoftTokenApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SoftTokenApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SoftTokenApplication.class, args);
	}

}
