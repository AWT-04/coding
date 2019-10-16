package org.fundacionjala.coding;

import org.fundacionjala.coding.fernando.Movie;
import org.fundacionjala.coding.fernando.RegularPrice;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {
    private final int priceCode = 15;
    private final int expected = 0;

    @Test
    public void getPriceCode() {
        Movie movie = new RegularPrice("Fast", priceCode);
        assertEquals(expected, movie.getPriceCode());
    }

    @Test
    public void setPriceCode() {
        Movie movie = new RegularPrice("Fast", priceCode);
        movie.setPriceCode(expected);
        assertEquals(expected, movie.getPriceCode());
    }

    @Test
    public void getTitle() {
        Movie movie = new RegularPrice("Fast", priceCode);
        assertEquals("Fast", movie.getTitle());
    }
}
