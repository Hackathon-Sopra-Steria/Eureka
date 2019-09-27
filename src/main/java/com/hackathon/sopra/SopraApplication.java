package com.hackathon.sopra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SopraApplication {

	public static void main(String[] args) {
		SpringApplication.run(SopraApplication.class, args);
	}

}
