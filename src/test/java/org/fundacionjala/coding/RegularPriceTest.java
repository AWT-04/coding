package org.fundacionjala.coding;

import org.fundacionjala.coding.fernando.Movie;
import org.fundacionjala.coding.fernando.RegularPrice;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RegularPriceTest {
    private static final int PRICECODE = 7;
    private static final double EXPECTED = 4.5;
    private static final int DAYS = 5;
    @Test
    public void getPriceCode() {
        Movie movie = new RegularPrice("Fast", PRICECODE);
        assertEquals(0, movie.getPriceCode());
    }

    @Test
    public void getCharge() {
        Movie movie = new RegularPrice("Fast", PRICECODE);
        assertNotEquals(EXPECTED, movie.getCharge(DAYS), 0.0);
    }
}
