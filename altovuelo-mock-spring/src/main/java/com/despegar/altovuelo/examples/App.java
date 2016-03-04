package com.despegar.altovuelo.examples;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.despegar.altovuelo.examples.domain.Flight;
import com.despegar.altovuelo.examples.domain.Hotel;
import com.despegar.altovuelo.examples.domain.Trip;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        TripGenerator generator = (TripGenerator) context.getBean("tripGenerator");

        Trip trip = generator.generateTrip();
        Flight flight = trip.getFlight();
        Hotel hotel = trip.getHotel();
        System.out.println("Destination: " + trip.getDestination().getName());
        System.out.println("Flight: " + flight.getAirline() + " - " + flight.getPriceInUsd() + " USD");
        System.out.println("Hotel: " + hotel.getName() + " - " + hotel.getPriceInUsd() + " USD");
        System.out.println("TOTAL: " + trip.getPriceInUsd() + " USD");
        context.close();
    }
}
