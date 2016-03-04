package com.despegar.altovuelo.examples.service;

import com.despegar.altovuelo.examples.domain.City;
import com.despegar.altovuelo.examples.domain.Hotel;
import org.apache.commons.lang3.RandomUtils;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GeneratedHotelServiceImpl implements HotelService {

    private static final List<String> names = Arrays.asList("Ryu", "Sheraton", "Hilton", "Four Seasons", "Hyatt");

    public Collection<Hotel> findHotel(City city, DateTime checkin, DateTime checkout) {
        Collection<Hotel> hotels = new ArrayList<Hotel>(5);
        for (int i = 0; i < 5; i++) {
            hotels.add(new Hotel(city, randomName(city), randomPrice()));
        }
        return hotels;
    }

    private String randomName(City city) {
        return names.get(RandomUtils.nextInt(0, names.size())) + " " + city.getName();
    }

    private BigDecimal randomPrice() {
        return BigDecimal.valueOf(RandomUtils.nextInt(2000, 19000));
    }
}
