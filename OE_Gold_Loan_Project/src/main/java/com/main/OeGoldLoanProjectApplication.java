package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class OeGoldLoanProjectApplication {

	public static void main(String[] args) {
		System.out.println("opreational exe");
		SpringApplication.run(OeGoldLoanProjectApplication.class, args);
	}

}
