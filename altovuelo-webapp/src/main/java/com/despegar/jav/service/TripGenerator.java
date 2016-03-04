package com.despegar.jav.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.joda.time.DateTime;

import com.despegar.jav.domain.City;
import com.despegar.jav.domain.Flight;
import com.despegar.jav.domain.Hotel;
import com.despegar.jav.domain.Priceable;
import com.despegar.jav.domain.Trip;

/**
 * Created by srosenbolt on 17/08/15.
 */
public class TripGenerator {
	private static final City BUE = new City("Buenos Aires", "BUE");
	public static final Comparator<Priceable> PRICEABLE_COMPARATOR = new Comparator<Priceable>() {
		public int compare(Priceable o1, Priceable o2) {
			return o1.getPriceInUsd().compareTo(o2.getPriceInUsd());
		}
	};

	private CityService cityService;
	private FlightService flightService;
	private HotelService hotelService;
	private RandomProvider randomProvider;

	public TripGenerator(CityService cityService, FlightService flightService, HotelService hotelService,
			RandomProvider randomProvider) {
		this.cityService = cityService;
		this.flightService = flightService;
		this.hotelService = hotelService;
		this.randomProvider = randomProvider;
	}

	public Trip generateTrip() {
		// Select destination
		City destination = randomCity();
		DateTime now = DateTime.now();
		// Find flight
		Flight flight = cheapestFlight(destination, now);
		// Find hotel
		Hotel hotel = cheapestHotel(destination, now);

		return new Trip(flight, hotel, destination);
	}

	public Trip generateTrip(String cityCode) {
		// Select destination
		City destination = getCity(cityCode);
		DateTime now = DateTime.now();
		// Find flight
		Flight flight = cheapestFlight(destination, now);
		// Find hotel
		Hotel hotel = cheapestHotel(destination, now);

		return new Trip(flight, hotel, destination);
	}

	private Flight cheapestFlight(City destination, DateTime now) {
		Collection<Flight> flights = flightService.findFlights(BUE, destination, now.plusMonths(1));
		SortedSet<Flight> sortedPriceables = new TreeSet<Flight>(PRICEABLE_COMPARATOR);
		sortedPriceables.addAll(flights);
		return sortedPriceables.first();
	}

	private Hotel cheapestHotel(City destination, DateTime now) {
		Collection<Hotel> hotels = hotelService.findHotel(destination, now.plusMonths(1), now.plusMonths(1)
				.plusDays(15));
		SortedSet<Hotel> sortedPriceables = new TreeSet<Hotel>(PRICEABLE_COMPARATOR);
		sortedPriceables.addAll(hotels);
		return sortedPriceables.first();
	}

	private City randomCity() {
		try {
			List<City> cities = new ArrayList<City>(cityService.getAll());
			return cities.get(randomProvider.nextInt(0, cities.size()));
		} catch (IOException e) {
			throw new RuntimeException("There was an error retrieving cities.", e);
		}
	}

	private City getCity(String cityCode) {
		try {
			return this.cityService.get(cityCode);
		} catch (IOException e) {
			throw new RuntimeException("There was an error retrieving city.", e);
		}
	}
}
