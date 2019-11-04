package org.fundacionjala.coding.Raul.test;

import org.fundacionjala.coding.raul.movies.Customer;
import org.fundacionjala.coding.raul.movies.Movie;
import org.fundacionjala.coding.raul.movies.Rental;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class CustomerTest {
    private LinkedList<Rental> rentals = new LinkedList();
    Customer customer = new Customer("Ramalaso");

    @Test
    public void getName() {
        Assert.assertEquals("Ramalaso", customer.getName());
    }

    @Test
    public void statement() {
        double totalAmount = 0.0;
        Assert.assertTrue(totalAmount==0.0 );
    }
}