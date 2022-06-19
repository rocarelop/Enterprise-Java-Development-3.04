package com.ironhack.lab34.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Flight {

    @Id
    @Column(name = "flight_number")
    private String flightNumber;

    @Column(name = "aircraft")
    private String aircraft;

    @Column(name = "aircraft_seats")
    private int seats;

    @Column(name = "flight_mileage")
    private int fMileage;

    public Flight(String flightNumber, String aircraft, int seats, int fMileage) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.seats = seats;
        this.fMileage = fMileage;
    }

    public Flight() {
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getfMileage() {
        return fMileage;
    }

    public void setfMileage(int fMileage) {
        this.fMileage = fMileage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return seats == flight.seats && fMileage == flight.fMileage && Objects.equals(flightNumber, flight.flightNumber) && Objects.equals(aircraft, flight.aircraft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, aircraft, seats, fMileage);
    }
}
