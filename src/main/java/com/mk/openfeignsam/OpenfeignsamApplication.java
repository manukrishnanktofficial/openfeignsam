package com.mk.openfeignsam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenfeignsamApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenfeignsamApplication.class, args);
	}

}
