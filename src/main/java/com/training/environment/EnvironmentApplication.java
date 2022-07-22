package com.training.environment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
@EnableWebMvc
public class EnvironmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnvironmentApplication.class, args);
	}

}
