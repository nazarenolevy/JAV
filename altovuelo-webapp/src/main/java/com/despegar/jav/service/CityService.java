package com.despegar.jav.service;

import java.io.IOException;
import java.util.Collection;

import com.despegar.jav.domain.City;

public interface CityService {
	/**
	 * @return all the known cities.
	 */
	Collection<City> getAll() throws IOException;

	City get(String cityCode) throws IOException;
}
