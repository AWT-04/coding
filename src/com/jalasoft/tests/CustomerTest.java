package com.jalasoft.tests;

import com.jalasoft.models.Customer;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void getName() {
        Customer customer = new Customer("Test");
        assertEquals("Test", customer.getName());
    }
}