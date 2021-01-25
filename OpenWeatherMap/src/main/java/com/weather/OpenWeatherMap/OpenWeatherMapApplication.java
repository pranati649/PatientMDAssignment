package com.weather.OpenWeatherMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.weather.OpenWeatherMap.repository"})
public class OpenWeatherMapApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenWeatherMapApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTempalte() {
		return new RestTemplate();
	}

}
