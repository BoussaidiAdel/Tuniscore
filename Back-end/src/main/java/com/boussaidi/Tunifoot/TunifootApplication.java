package com.boussaidi.Tunifoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@ComponentScan(basePackages = {"Controllers" , "Services" , "Repos" , "Models" , "Config"})
@EnableMongoRepositories(basePackages = "Repos")
public class TunifootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TunifootApplication.class, args);
	}



}
