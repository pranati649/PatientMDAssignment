package com.weather.OpenWeatherMap.dao;

import com.weather.OpenWeatherMap.entity.OpenWeatherEntity;

public interface WeatherDao {
	public String saveWeatherDetails(OpenWeatherEntity entity);
}
