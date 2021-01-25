package com.weather.OpenWeatherMap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.OpenWeatherMap.model.WeatherDTO;
import com.weather.OpenWeatherMap.service.WeatherService;

@RestController
@RequestMapping("/weather")
public class WeatherController {

	@Autowired
	private WeatherService service;
	
	/*
	 * This  method is used to save the Weather json data 
	 * @author Pranati
	 */
	@GetMapping("/getWeatherDetails")
	public ResponseEntity<String> getWeather() {
			
		HttpStatus status;
		String statusMessage=null;
		try {
			statusMessage=service.saveWeatherDetails();
			status = HttpStatus.OK;
		} catch (Exception ex) {
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return ResponseEntity.status(status)
				.body(statusMessage);
	}
}
