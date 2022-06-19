package com.ironhack.lab34.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Customer {
    @Id
    @Column(name = "id_customer")
    private int idCustomer;

    @Column(name = "customer_name")
    private String name;

    @Column(name = "customer_mileage")
    private int cMileage;

    @Column(name = "customer_status")
    private String status;

    public Customer(int idCustomer, String name, int cMileage, String status) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.cMileage = cMileage;
        this.status = status;
    }

    public Customer(){

    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getcMileage() {
        return cMileage;
    }

    public void setcMileage(int cMileage) {
        this.cMileage = cMileage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return idCustomer == customer.idCustomer && cMileage == customer.cMileage && Objects.equals(name, customer.name) && Objects.equals(status, customer.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCustomer, name, cMileage, status);
    }
}
