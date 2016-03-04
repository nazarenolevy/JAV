package com.despegar.jav.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import com.despegar.jav.domain.City;

/**
 * Created by srosenbolt on 17/08/15.
 */
public class MemoryCityServiceImpl implements CityService {
	private static final Collection<City> cities;
	static {
		cities = Arrays.asList(new City("Paris", "PAR"), new City("Londres", "LON"), new City("San Pablo", "SAO"),
				new City("CORDOBA", "COR"), new City("Nueva York", "NYC"), new City("Santiago de Chile", "SCL"),
				new City("Bogota", "BOG"), new City("Tokyo", "TYO"), new City("Cancún", "CUN"));
	}

	public Collection<City> getAll() throws IOException {
		return cities;
	}

	public City get(String cityCode) throws IOException {
		cityCode = cityCode.toUpperCase();
		for (City city : cities) {
			if (city.getIataCode().equals(cityCode)) {
				return city;
			}
		}
		throw new RuntimeException("City not found " + cityCode);
	}
}
