package com.opentext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StocksMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StocksMsApplication.class, args);
		System.out.println("Stocks MS started successfully.....");
	}

}
