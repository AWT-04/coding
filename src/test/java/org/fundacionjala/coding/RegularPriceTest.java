package org.fundacionjala.coding;

import org.fundacionjala.coding.fernando.Movie;
import org.fundacionjala.coding.fernando.RegularPrice;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RegularPriceTest {
    private final int priceCode = 7;
    private final double expected = 4.5;
    private final int days = 5;
    @Test
    public void getPriceCode() {
        Movie movie = new RegularPrice("Fast", priceCode);
        assertEquals(0, movie.getPriceCode());
    }

    @Test
    public void getCharge() {
        Movie movie = new RegularPrice("Fast", priceCode);
        assertNotEquals(expected, movie.getCharge(days), 0.0);
    }
}
