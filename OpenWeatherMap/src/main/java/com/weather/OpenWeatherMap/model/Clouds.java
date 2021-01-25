package com.weather.OpenWeatherMap.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Clouds implements Serializable {
	private static final long serialVersionUID = 134666L;
	@JsonProperty(value ="all")
	private Integer all;
	public Integer getAll() {
		return all;
	}
	public void setAll(Integer all) {
		this.all = all;
	}
	

}
