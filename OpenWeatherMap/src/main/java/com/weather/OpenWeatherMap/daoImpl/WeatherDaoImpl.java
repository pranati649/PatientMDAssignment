package com.weather.OpenWeatherMap.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weather.OpenWeatherMap.constant.Constant;
import com.weather.OpenWeatherMap.dao.WeatherDao;
import com.weather.OpenWeatherMap.entity.OpenWeatherEntity;
import com.weather.OpenWeatherMap.entity.WeatherEntity;
import com.weather.OpenWeatherMap.repository.WeatherRepository;
@Component
public class WeatherDaoImpl implements WeatherDao{

	@Autowired
	private WeatherRepository repository;
	@Override
	public String saveWeatherDetails(OpenWeatherEntity entity) {
		repository.save(entity);
		return Constant.SUCCESS_KEY;
		
	}

}
