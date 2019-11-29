package org.fundacionjala.coding.movies.andy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class RentalTest {
    private Movie movie;
    private int daysRented;
    private final int daysRented2 = 5;
    private Movie movie1;
    private final int priceCode = 3;

    @Test
    public void getDaysRented() {
        daysRented = 2;

        assertNotEquals(daysRented, daysRented2);
    }

    @Test(expected = NullPointerException.class)
    public void getMovie() {
        movie.getClass().getName();
        assertNotEquals(movie, "Movie");
        assertEquals(priceCode, movie.getPriceCode());
    }

    @Test(expected = NullPointerException.class)
    public void statement() {
        daysRented = 1;
        assertEquals(movie.statement(daysRented), movie1.statement(daysRented));
    }

    @Test(expected = NullPointerException.class)
    public void frequentRenterPoints() {
        daysRented = 1;
        Assert.assertEquals(movie.statement(daysRented), movie1.statement(daysRented));
    }
}
