package com.kfit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource(
        locations = {"classpath*:applicationProvider.xml"}
)
public class provider {
	

	public static void main(String[] args) {
		SpringApplication.run(provider.class, args);
	}
	
}
