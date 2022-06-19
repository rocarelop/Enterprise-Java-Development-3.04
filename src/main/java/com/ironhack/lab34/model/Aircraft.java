package com.ironhack.lab34.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "id_customer_flight")
public class Aircraft {
    @Id
    @Column(name = "id_flight_number")
    private String idFlightNumber;

    @Column(name = "id_customer")
    private int idCustomer;

    @Column(name = "flight_number")
    private String flightNumber;

    public Aircraft(String idFlightNumber, int idCustomer, String flightNumber) {
        this.idFlightNumber = idFlightNumber;
        this.idCustomer = idCustomer;
        this.flightNumber = flightNumber;
    }

    public Aircraft() {
    }

    public String getIdFlightNumber() {
        return idFlightNumber;
    }

    public void setIdFlightNumber(String idFlightNumber) {
        this.idFlightNumber = idFlightNumber;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
}
