package com.capg.onlinewallet;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class Client {

	public static void main(String[] args) {
		SpringApplication.run(Client.class, args);
		System.out.println("Spring Boot Application started..");
	}

}
