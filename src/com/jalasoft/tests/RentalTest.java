package com.jalasoft.tests;

import com.jalasoft.models.Movie;
import com.jalasoft.models.Rental;
import org.junit.Test;
import static org.junit.Assert.*;

public class RentalTest {
    Rental rental = new Rental(new Movie("Grinch"), 2);
    @Test
    public void getDaysRented() {
        assertEquals("Grinch", rental.getMovie().getTitle());
        assertEquals(13, rental.getMovie().getPriceCode());
    }

    @Test
    public void getMovie() {
        assertEquals(2, rental.getDaysRented());
    }
}