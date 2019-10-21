package org.fundacionjala.coding.movies.andy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class NewReleaseMovieTest {
    public static final double NEW_RELEASE = 3;
    private final int days = 5;

    @Test
    public void statement() {
        double thisAmount = 0;
        thisAmount = NEW_RELEASE;
        assertNotEquals(thisAmount, NEW_RELEASE * days);
    }

    @Test(expected = AssertionError.class)
    public void frequentRenterPoints() {
        int frequentRenterPoints = 0;
        frequentRenterPoints = frequentRenterPoints + 1;
        assertEquals(frequentRenterPoints, frequentRenterPoints * days);
    }
}
