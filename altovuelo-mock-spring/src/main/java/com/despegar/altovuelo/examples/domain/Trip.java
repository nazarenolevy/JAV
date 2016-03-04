package com.despegar.altovuelo.examples.domain;

import java.math.BigDecimal;

/**
 * Created by srosenbolt on 17/08/15.
 */
public class Trip implements  Priceable{
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

    @Override
    public BigDecimal getPriceInUsd() {
        return hotel.getPriceInUsd().add(flight.getPriceInUsd());
    }
}
