package com.weather.OpenWeatherMap.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coordinate implements Serializable {

	private static final long serialVersionUID = 1234123L;
	@JsonProperty(value = "lon")
	private Double lon;
	@JsonProperty(value = "lat")
	private Double lat;
	public Double getLon() {
		return lon;
	}
	public void setLon(Double lon) {
		this.lon = lon;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	@Override
	public String toString() {
		return "Coordinate [lon=" + lon + ", lat=" + lat + "]";
	}
	
}
