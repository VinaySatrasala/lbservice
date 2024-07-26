package com.vks.microservices.lbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class LbserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LbserviceApplication.class, args);
	}

}
