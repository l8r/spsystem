package com.jiangshun.sp.servicecenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpServicecenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpServicecenterApplication.class, args);
	}
}
