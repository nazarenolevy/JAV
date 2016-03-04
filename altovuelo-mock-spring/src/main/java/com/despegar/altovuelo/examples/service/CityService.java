package com.despegar.altovuelo.examples.service;

import com.despegar.altovuelo.examples.domain.City;

import java.io.IOException;
import java.util.Collection;

public interface CityService {
    /**
     * @return all the known cities.
     */
    Collection<City> getAll() throws IOException;
}
