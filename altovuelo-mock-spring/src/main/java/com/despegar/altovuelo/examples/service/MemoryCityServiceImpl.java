package com.despegar.altovuelo.examples.service;

import com.despegar.altovuelo.examples.domain.City;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by srosenbolt on 17/08/15.
 */
public class MemoryCityServiceImpl implements CityService {
    private static final Collection<City> cities;
    static {
        cities = Arrays.asList(new City("Paris", "PAR"),
                new City("Londres", "LON"),
                new City("San Pablo", "SAO"),
                new City("CORDOBA", "COR"),
                new City("Nueva York", "NYC"),
                new City("Santiago de Chile", "SCL"),
                new City("Bogota", "BOG"),
                new City("Tokyo", "TYO"),
                new City("Cancún", "CUN")
        );
    }

    @Override
    public Collection<City> getAll() throws IOException {
        return cities;
    }
}
