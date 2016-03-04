package com.despegar.altovuelo.examples.service;

import com.despegar.altovuelo.examples.domain.City;
import com.despegar.altovuelo.examples.domain.Hotel;
import org.joda.time.DateTime;

import java.util.Collection;

public interface HotelService {
    Collection<Hotel> findHotel(City city, DateTime checkin, DateTime checkout);
}
