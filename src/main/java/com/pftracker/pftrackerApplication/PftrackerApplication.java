package com.pftracker.pftrackerApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Personal Finance tracker API",
				version = "0.1",
				description = "PF Tracker API"
		)
)
public class PftrackerApplication {
	public static void main(String[] args) {
		SpringApplication.run(PftrackerApplication.class, args);
	}
}
