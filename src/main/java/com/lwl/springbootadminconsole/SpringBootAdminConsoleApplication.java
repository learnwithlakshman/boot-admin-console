package com.lwl.springbootadminconsole;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableDiscoveryClient
@EnableAdminServer
@SpringBootApplication
public class SpringBootAdminConsoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminConsoleApplication.class, args);
	}

}
