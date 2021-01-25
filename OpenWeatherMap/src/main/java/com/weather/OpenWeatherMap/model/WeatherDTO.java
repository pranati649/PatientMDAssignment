package com.weather.OpenWeatherMap.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1219L;

	@JsonProperty(value = "visibility")
	private Integer visibility;

	@JsonProperty(value = "coord")
	private Coordinate coord;

	private List<Weather> weather;

	@JsonProperty(value = "base")
	private String base;
	
	@JsonProperty(value = "timezone")
	private Integer timezone;
	
	@JsonProperty(value = "id")
	private Integer id;
	
	@JsonProperty(value = "name")
	private String name;
	
	@JsonProperty(value = "cod")
	private Integer cod;
	
	@JsonProperty(value = "main")
	private Main main;
	
	@JsonProperty(value = "wind")
	private WindDto wind;
	
	@JsonProperty(value = "clouds")
	private Clouds clouds;

	public Integer getVisibility() {
		return visibility;
	}

	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	public Coordinate getCoord() {
		return coord;
	}

	public void setCoord(Coordinate coord) {
		this.coord = coord;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Integer getTimezone() {
		return timezone;
	}

	public void setTimezone(Integer timezone) {
		this.timezone = timezone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public WindDto getWind() {
		return wind;
	}

	public void setWind(WindDto wind) {
		this.wind = wind;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	
	
	
}
