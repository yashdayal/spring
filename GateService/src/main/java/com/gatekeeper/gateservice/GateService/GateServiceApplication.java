package com.gatekeeper.gateservice.GateService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})

public class GateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GateServiceApplication.class, args);
	}

}
