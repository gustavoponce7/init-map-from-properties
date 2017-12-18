package com.gpch.initmap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties
public class InitMapApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitMapApplication.class, args);
	}

	@Bean
	public CommandLineRunner setup(MockData mockData) {
		return (args) -> {
			System.out.println("mock");
			mockData.getMap().forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
		};
	}
}
