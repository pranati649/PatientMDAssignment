package com.weather.OpenWeatherMap.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.weather.OpenWeatherMap.dao.WeatherDao;
import com.weather.OpenWeatherMap.entity.OpenWeatherEntity;
import com.weather.OpenWeatherMap.entity.OverCaseEntity;
import com.weather.OpenWeatherMap.entity.WeatherEntity;
import com.weather.OpenWeatherMap.model.Weather;
import com.weather.OpenWeatherMap.model.WeatherDTO;
import com.weather.OpenWeatherMap.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {
	Logger logger = LoggerFactory.getLogger(WeatherServiceImpl.class);
	@Value("${weathermap.url}")
	private String weatherMapUrl;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private WeatherDao dao;

	/*
	 * This method is used to save the OpenWeatherDetails
	 * @author Pranati
	 */
	
	@Override
	public String saveWeatherDetails() throws WeatherException {
		// we can use restTemplate.exchange method also
		try {
			logger.debug("started to fetch weather from url {}", weatherMapUrl);
			// WeatherDTO dto=restTemplate.getForObject(weatherMapUrl, WeatherDTO.class);
			// return dao.saveWeatherDetails(dtoToEntity(dto));
			String jsonStr = restTemplate.getForObject(weatherMapUrl, String.class);
			OpenWeatherEntity entity = new OpenWeatherEntity();
			entity.setResponseCriteria(jsonStr);
			logger.debug("ended to fetch weather");
			return dao.saveWeatherDetails(entity);
		} catch (Exception ex) {
			logger.error("Exception occured while saving saveWeatherDetails {}",ex);
			throw new WeatherException(ex.getMessage());
		}

	}

	/*
	 * This method is used to convert dto to entity
	 * this persistence object will be pass to dao to save the data
	 * @author Pranati
	 */
	private WeatherEntity dtoToEntity(WeatherDTO dto) {
		WeatherEntity entity = new WeatherEntity();
		entity.setName(dto.getName());
		entity.setBase(dto.getBase());
		entity.setCod(dto.getCod());
		entity.setLat(dto.getCoord().getLat());
		entity.setLon(dto.getCoord().getLon());
		entity.setAll(dto.getClouds().getAll());
		entity.setTemp(dto.getMain().getTemp());
		entity.setFeels_like(dto.getMain().getFeels_like());
		entity.setTemp_min(dto.getMain().getTemp_min());
		entity.setTemp_max(dto.getMain().getTemp_max());
		entity.setPressure(dto.getMain().getPressure());
		entity.setHumidity(dto.getMain().getHumidity());
		entity.setSpeed(dto.getWind().getSpeed());
		entity.setDeg(dto.getWind().getDeg());

		List<OverCaseEntity> weathers = new ArrayList<OverCaseEntity>();
		for (Weather weather : dto.getWeather()) {
			OverCaseEntity caseEntity = new OverCaseEntity();
			caseEntity.setDescription(weather.getDescription());
			caseEntity.setIcon(weather.getIcon());
			caseEntity.setId(weather.getId());
			caseEntity.setMain(weather.getMain());
			weathers.add(caseEntity);
		}
		entity.setWeather(weathers);
		return entity;
	}

}
