package com.catchemall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CatchEmAllApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatchEmAllApplication.class, args);
	}

}
