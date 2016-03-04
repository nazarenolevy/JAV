package com.despegar.jav.service;

import java.util.Collection;

import org.joda.time.DateTime;

import com.despegar.jav.domain.City;
import com.despegar.jav.domain.Hotel;

public interface HotelService {
    Collection<Hotel> findHotel(City city, DateTime checkin, DateTime checkout);
}
