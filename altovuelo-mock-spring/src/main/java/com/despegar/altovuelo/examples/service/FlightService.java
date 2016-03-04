package com.despegar.altovuelo.examples.service;

import com.despegar.altovuelo.examples.domain.City;
import com.despegar.altovuelo.examples.domain.Flight;
import org.joda.time.DateTime;

import java.util.Collection;

public interface FlightService {
    Collection<Flight> findFlights(City from, City to, DateTime date);
}
