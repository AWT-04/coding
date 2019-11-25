package org.fundacionjala.coding;

import org.fundacionjala.coding.fernando.Movie;
import org.fundacionjala.coding.fernando.RegularPrice;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class RegularPriceTest {
    private static final double EXPECTED = 4.5;
    private static final int DAYS = 5;

    @Test
    public void getCharge() {
        Movie movie = new RegularPrice("Fast");
        assertNotEquals(EXPECTED, movie.getCharge(DAYS), 0.0);
    }
}
