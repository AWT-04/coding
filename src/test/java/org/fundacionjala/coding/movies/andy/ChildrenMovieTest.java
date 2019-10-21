package org.fundacionjala.coding.movies.andy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ChildrenMovieTest {
    public static final double CHILDRENS = 1.5;
    private final int days = 3;
    @Test
    public void statement() {
        double thisAmount = 0;
        thisAmount += CHILDRENS * days;
        assertNotEquals(CHILDRENS, thisAmount);
    }

    @Test(expected = AssertionError.class)
    public void frequentRenterPoints() {
        int frequentRenterPoints = 0;
        frequentRenterPoints++;
        assertEquals(frequentRenterPoints, (days * frequentRenterPoints));
    }
}
