package org.fundacionjala.coding;

import org.fundacionjala.coding.fernando.ChildrensPrice;
import org.fundacionjala.coding.fernando.Movie;
import org.fundacionjala.coding.fernando.NewReleasePrice;
import org.fundacionjala.coding.fernando.Rental;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RentalTest {
    private static final int PRICECODE = 15;
    private static final double EXPECTED = 5;
    private static final int DAYS = 10;

    @Test(expected = AssertionError.class)
    public void getDaysRented() {
        Movie movie = new NewReleasePrice("Fast", PRICECODE);
        Rental rental = new Rental(movie, DAYS);
        assertTrue(rental.getDaysRented() == EXPECTED);
    }

    @Test
    public void getMovie() {
        Movie movie = new ChildrensPrice("Fast", PRICECODE);
        Rental rental = new Rental(movie, DAYS);
        assertTrue(rental.getMovie() == movie);
    }
}
