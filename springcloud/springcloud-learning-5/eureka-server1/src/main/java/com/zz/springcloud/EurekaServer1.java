package com.zz.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer1{

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaServer1.class).web(true).run(args);
	}

}
