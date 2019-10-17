package org.fundacionjala.coding;

import org.fundacionjala.coding.fernando.Movie;
import org.fundacionjala.coding.fernando.RegularPrice;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {
    private static final int PRICECODE = 15;
    private static final int EXPECTED = 0;

    @Test
    public void getPriceCode() {
        Movie movie = new RegularPrice("Fast", PRICECODE);
        assertEquals(EXPECTED, movie.getPriceCode());
    }

    @Test
    public void setPriceCode() {
        Movie movie = new RegularPrice("Fast", PRICECODE);
        movie.setPriceCode(EXPECTED);
        assertEquals(EXPECTED, movie.getPriceCode());
    }

    @Test
    public void getTitle() {
        Movie movie = new RegularPrice("Fast", PRICECODE);
        assertEquals("Fast", movie.getTitle());
    }
}
