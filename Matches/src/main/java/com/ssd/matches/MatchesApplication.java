package com.ssd.matches;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MatchesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatchesApplication.class, args);
		System.out.println("Go on matches");
	}
	
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
