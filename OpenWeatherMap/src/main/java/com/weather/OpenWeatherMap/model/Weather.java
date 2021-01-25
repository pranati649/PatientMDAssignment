package com.weather.OpenWeatherMap.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather implements Serializable {

	private static final long serialVersionUID = 156465L;
	@JsonProperty(value = "id")
	private Integer id;
	
	@JsonProperty(value = "main")
	private String main;
	
	@JsonProperty(value = "description")
	private String description;
	
	@JsonProperty(value = "icon")
	private String icon;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Override
	public String toString() {
		return "Weather [id=" + id + ", main=" + main + ", description=" + description + ", icon=" + icon + "]";
	}

}
