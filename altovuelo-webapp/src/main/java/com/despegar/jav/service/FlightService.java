package com.despegar.jav.service;

import java.util.Collection;

import org.joda.time.DateTime;

import com.despegar.jav.domain.City;
import com.despegar.jav.domain.Flight;

public interface FlightService {
    Collection<Flight> findFlights(City from, City to, DateTime date);
}
