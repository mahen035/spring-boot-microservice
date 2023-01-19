package com.springboot.infeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class InfEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfEurekaServerApplication.class, args);
	}

}
