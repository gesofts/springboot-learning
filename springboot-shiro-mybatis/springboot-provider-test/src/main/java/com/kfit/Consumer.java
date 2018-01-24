package com.kfit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource(
        locations = {"classpath*:applicationConsumer.xml"}
)
public class Consumer {
	

	public static void main(String[] args) {
		SpringApplication.run(Consumer.class, args);
	}
	
}
