package com.gateway.shopgtw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ShopgtwApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopgtwApplication.class, args);
	}

}
