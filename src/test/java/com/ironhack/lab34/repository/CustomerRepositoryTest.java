package com.ironhack.lab34.repository;

import com.ironhack.lab34.model.Customer;
import com.ironhack.lab34.model.Flight;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;
    Customer customer1;
    Customer customer2;

    @BeforeEach
    void setUp() {
        customer1= new Customer(1, "Agustine Riviera", 115235, "Silver");
        customer2= new Customer(2, "Alaina Sepulvida", 115235, "Silver");
        customerRepository.save(customer1);
        customerRepository.save(customer2);

    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    void test_JPAMethods() {

        List<Customer> customerList = customerRepository.findAll();
        assertEquals(2, customerList.size());
    }


    @Test
    void findByName_ValidName_ExistingCustomer(){
        List<Customer> customerList1 = customerRepository.findByName("Agustine Riviera");
        assertTrue(customerList1.size()==1);
        assertEquals(customer1, customerList1.get(0));

    }

    @Test
    void findByStatus_Valid() {
        List<Customer> customerList2 = customerRepository.findByStatus("Silver");
        assertTrue(customerList2.size()==2);
        assertEquals(customer1.getStatus(), customerList2.get(0).getStatus());

    }
}