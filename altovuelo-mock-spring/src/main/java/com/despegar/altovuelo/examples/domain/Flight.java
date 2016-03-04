package com.despegar.altovuelo.examples.domain;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import java.math.BigDecimal;

public class Flight implements Priceable {
    private City origin;
    private City destination;
    private String airline;
    private BigDecimal priceInUsd;
    private DateTime date;

    public Flight(City origin, City destination, String airline, BigDecimal priceInUsd, DateTime date) {
        this.origin = origin;
        this.destination = destination;
        this.airline = airline;
        this.priceInUsd = priceInUsd;
        this.date = date;
    }

    public City getOrigin() {
        return origin;
    }

    public City getDestination() {
        return destination;
    }

    public String getAirline() {
        return airline;
    }

    public BigDecimal getPriceInUsd() {
        return priceInUsd;
    }

    public DateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "origin=" + origin.getIataCode() +
                ", destination=" + destination.getIataCode() +
                ", airline='" + airline + '\'' +
                ", priceInUsd=" + priceInUsd +
                ", date=" + date.toString(DateTimeFormat.shortDateTime()) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (airline != null ? !airline.equals(flight.airline) : flight.airline != null) return false;
        if (date != null ? !date.equals(flight.date) : flight.date != null) return false;
        if (destination != null ? !destination.equals(flight.destination) : flight.destination != null) return false;
        if (origin != null ? !origin.equals(flight.origin) : flight.origin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = origin != null ? origin.hashCode() : 0;
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        result = 31 * result + (airline != null ? airline.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
