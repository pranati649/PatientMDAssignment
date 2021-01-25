package com.weather.OpenWeatherMap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weather.OpenWeatherMap.entity.OpenWeatherEntity;
import com.weather.OpenWeatherMap.entity.WeatherEntity;

@Repository
public interface WeatherRepository extends JpaRepository<OpenWeatherEntity, Integer> {

}
