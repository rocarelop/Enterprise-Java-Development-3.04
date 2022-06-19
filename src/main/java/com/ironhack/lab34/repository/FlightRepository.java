package com.ironhack.lab34.repository;

import com.ironhack.lab34.model.Customer;
import com.ironhack.lab34.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, String> {
    List<Flight> findByFlightNumber(String flightNumber);
    List<Flight> findByAircraftContaining(String aircraft);
    List<Flight> findByfMileageGreaterThan(int miles);

}
