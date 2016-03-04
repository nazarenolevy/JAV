package com.despegar.altovuelo.examples;

import com.despegar.altovuelo.examples.domain.City;
import com.despegar.altovuelo.examples.domain.Flight;
import com.despegar.altovuelo.examples.domain.Hotel;
import com.despegar.altovuelo.examples.domain.Trip;
import com.despegar.altovuelo.examples.service.CityService;
import com.despegar.altovuelo.examples.service.FlightService;
import com.despegar.altovuelo.examples.service.HotelService;
import com.despegar.altovuelo.examples.service.RandomProvider;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.net.SocketException;
import java.util.Arrays;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class TripGeneratorTest {
    private TripGenerator tripGenerator;
    private FlightService flightService;
    private CityService cityService;
    private HotelService hotelService;
    private RandomProvider randomProvider;

    private static final City LAS = new City("Las Vegas", "LAS");
    private static final City BUE = new City("Buenos Aires", "BUE");

    @Before
    public void setUp(){
        tripGenerator= new TripGenerator();
        cityService = mock(CityService.class);
        tripGenerator.setCityService(cityService);

        flightService = mock(FlightService.class);
        tripGenerator.setFlightService(flightService);

        hotelService= mock(HotelService.class);
        tripGenerator.setHotelService(hotelService);

        randomProvider = mock(RandomProvider.class);
        tripGenerator.setRandomProvider(randomProvider);
    }

    @Test
    public void testCheapestTrip() throws Exception {

        when(cityService.getAll()).thenReturn(Arrays.asList(LAS));

        DateTime date = DateTime.now().plusMonths(1);
        Flight flight1 = new Flight(BUE, LAS, "AR", new BigDecimal(2000), date);
        Flight flight2 = new Flight(BUE, LAS, "LA", new BigDecimal(1000), date);
        when(flightService.findFlights(eq(BUE), eq(LAS), any(DateTime.class))).thenReturn(Arrays.asList(flight1, flight2));

        Hotel hotel1 = new Hotel(LAS, "Sheraton Las Vegas", new BigDecimal(500));
        Hotel hotel2 = new Hotel(LAS, "Luxor Las Vegas", new BigDecimal(800));

        when(hotelService.findHotel(eq(LAS), any(DateTime.class), any(DateTime.class))).thenReturn(Arrays.asList(hotel1, hotel2));

        Trip trip = tripGenerator.generateTrip();

        assertEquals(LAS, trip.getDestination());
        assertEquals(flight2, trip.getFlight());
        assertEquals(hotel1, trip.getHotel());
    }


    @Test(expected = RuntimeException.class)
    public void testException() throws Exception {
        when(cityService.getAll()).thenThrow(new SocketException("Socket timeout querying for city."));
        Trip trip = tripGenerator.generateTrip();
    }

    @Test
    public void testRandomCity() throws Exception{

        when(cityService.getAll()).thenReturn(Arrays.asList(BUE, BUE, LAS, BUE, BUE));

        DateTime date = DateTime.now().plusMonths(1);

        // Fuerzo el random provider
        when(randomProvider.nextInt(0, 5)).thenReturn(2);

        Flight flight1 = new Flight(BUE, LAS, "AR", new BigDecimal(2000), date);
        when(flightService.findFlights(eq(BUE), eq(LAS), any(DateTime.class))).thenReturn(Arrays.asList(flight1));

        Hotel hotel1 = new Hotel(LAS, "Sheraton Las Vegas", new BigDecimal(500));

        when(hotelService.findHotel(eq(LAS), any(DateTime.class), any(DateTime.class))).thenReturn(Arrays.asList(hotel1));

        Trip trip = tripGenerator.generateTrip();

        assertEquals(LAS, trip.getDestination());
    }
}