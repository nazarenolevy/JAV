package com.despegar.altovuelo.examples.domain;

import java.math.BigDecimal;

public class Hotel implements Priceable {
    private City city;
    private String name;
    private BigDecimal priceInUsd;

    public Hotel(City city, String name, BigDecimal priceInUsd) {
        this.city = city;
        this.name = name;
        this.priceInUsd = priceInUsd;
    }

    public City getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPriceInUsd() {
        return priceInUsd;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hotel hotel = (Hotel) o;

        if (name != null ? !name.equals(hotel.name) : hotel.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
