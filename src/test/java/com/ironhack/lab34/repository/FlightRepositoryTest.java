package com.ironhack.lab34.repository;

import com.ironhack.lab34.model.Customer;
import com.ironhack.lab34.model.Flight;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class FlightRepositoryTest {

    @Autowired
    private FlightRepository flightRepository;
    Flight flight1;
    Flight flight2;

    @BeforeEach
    void setUp() {
        flight1 = new Flight("DL143", "Boeing 747", 400, 135);
        flight2 = new Flight("DL122", "Airbus A330", 236, 4370);
        flightRepository.save(flight1);
        flightRepository.save(flight2);
    }

    @AfterEach
    void tearDown() {
        flightRepository.deleteAll();
    }

    @Test
    void findByFlightNumber() {
        List<Flight> flightList = flightRepository.findByFlightNumber("DL143");
        assertTrue(flightList.size()==1);
        assertEquals(flight1.getFlightNumber(), flightList.get(0).getFlightNumber());
    }

    @Test
    void findByBoeingContaining() {
        List<Flight> flightList = flightRepository.findByAircraftContaining("Boeing");
        assertTrue(flightList.size()==1);
        assertEquals(flight1.getAircraft(), flightList.get(0).getAircraft());

    }

    @Test
    void findByFMileageGreaterThan() {
        List<Flight> flightList = flightRepository.findByfMileageGreaterThan(500);
        assertTrue(flightList.size()==1);
        assertEquals(flight2.getfMileage(), flightList.get(0).getfMileage());
    }
}