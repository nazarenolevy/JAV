package com.despegar.jav.domain;

import java.math.BigDecimal;

/**
 * Created by srosenbolt on 17/08/15.
 */
public class Trip implements Priceable {
	private Flight flight;
	private Hotel hotel;
	private City destination;

	public Trip(Flight flight, Hotel hotel, City destination) {
		this.flight = flight;
		this.hotel = hotel;
		this.destination = destination;
	}

	public Flight getFlight() {
		return flight;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public City getDestination() {
		return destination;
	}

	public BigDecimal getPriceInUsd() {
		return hotel.getPriceInUsd().add(flight.getPriceInUsd());
	}

	@Override
	public String toString() {
		return "Trip [flight=" + flight + ", hotel=" + hotel + ", destination=" + destination + "]";
	}
	
	
}
