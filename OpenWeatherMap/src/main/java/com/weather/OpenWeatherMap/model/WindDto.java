package com.weather.OpenWeatherMap.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WindDto implements Serializable {
	private static final long serialVersionUID = 1678L;
	@JsonProperty(value = "speed")
	private Double speed;
	
	@JsonProperty(value = "deg")
	private Double deg;

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public Double getDeg() {
		return deg;
	}

	public void setDeg(Double deg) {
		this.deg = deg;
	}

}
