package com.springboot.movieratingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InfMovieRatingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfMovieRatingServiceApplication.class, args);
	}

}
