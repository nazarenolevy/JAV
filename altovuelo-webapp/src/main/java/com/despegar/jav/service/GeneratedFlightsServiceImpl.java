package com.despegar.jav.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang3.RandomUtils;
import org.joda.time.DateTime;

import com.despegar.jav.domain.City;
import com.despegar.jav.domain.Flight;

/**
 * This is a fake implementation of flights service
 *
 * @author srosenbolt
 */
public class GeneratedFlightsServiceImpl implements FlightService {

    private static final List<String> carriers;

    static {
        carriers = Arrays.asList("AR", "LA", "DL", "G3", "JJ");
    }

    /**
     * Generate 5 flights matching the given parameters.
     *
     * @param from
     * @param to
     * @param date
     * @return
     */
    public Collection<Flight> findFlights(City from, City to, DateTime date) {
        Collection<Flight> flights = new ArrayList<Flight>(5);
        for (int i = 0; i < 5; i++) {
            flights.add(new Flight(from, to, randomAirline(),  randomPrice(), date));
        }

        return flights;
    }

    private String randomAirline() {
        return carriers.get(RandomUtils.nextInt(0, carriers.size()));
    }

    private BigDecimal randomPrice() {
        return BigDecimal.valueOf(RandomUtils.nextInt(2000, 19000));
    }
}
