package org.fundacionjala.coding.movies.andy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class RegularMovieTest {
    private static final double REGULAR = 1.5;
    private final int days = 3;

    @Test
    public void statement() {
        double thisAmount = 0;
        thisAmount = thisAmount + REGULAR;
        thisAmount += 2;
        assertNotEquals(thisAmount, REGULAR * days);
    }

    @Test(expected = AssertionError.class)
    public void frequentRenterPoints() {
        int frequentRenterPoints = 0;
        frequentRenterPoints = frequentRenterPoints + 1;
        assertEquals(frequentRenterPoints, REGULAR * days);
    }
}
