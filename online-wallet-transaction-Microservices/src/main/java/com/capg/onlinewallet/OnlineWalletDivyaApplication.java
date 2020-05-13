package com.capg.onlinewallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableEurekaClient
@EnableEurekaClient
public class OnlineWalletDivyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineWalletDivyaApplication.class, args);
		System.out.println("spring boot for transaction method started");
	}

	@Bean
	public RestTemplate getRestTemplate()
	{
		return  new RestTemplate();
	}
}
