package com.capg.onlinewallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//@EnableEurekaClient
@EnableEurekaServer
public class OnlineWalletDivya1TransactionCapgEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineWalletDivya1TransactionCapgEurekaApplication.class, args);
	}

}
