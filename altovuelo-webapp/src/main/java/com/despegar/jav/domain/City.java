package com.despegar.jav.domain;

public class City {
    private String name;
    private String iataCode;

    public City(String name, String iataCode) {
        this.name = name;
        this.iataCode = iataCode;
    }

    public String getName() {
        return name;
    }

    public String getIataCode() {
        return iataCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (iataCode != null ? !iataCode.equals(city.iataCode) : city.iataCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return iataCode != null ? iataCode.hashCode() : 0;
    }
}
