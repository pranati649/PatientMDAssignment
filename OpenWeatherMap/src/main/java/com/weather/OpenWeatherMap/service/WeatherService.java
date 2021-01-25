package com.weather.OpenWeatherMap.service;

import com.weather.OpenWeatherMap.serviceimpl.WeatherException;

public interface WeatherService {
	public String saveWeatherDetails() throws WeatherException;
}
