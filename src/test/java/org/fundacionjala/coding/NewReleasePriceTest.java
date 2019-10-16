package org.fundacionjala.coding;

import org.fundacionjala.coding.fernando.ChildrensPrice;
import org.fundacionjala.coding.fernando.Movie;
import org.fundacionjala.coding.fernando.NewReleasePrice;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NewReleasePriceTest {
    private final int priceCode = 7;
    private final double expected = 0.0;
    @Test
    public void getPriceCode() {
        Movie movie = new NewReleasePrice("Fast", priceCode);
        assertEquals(1, movie.getPriceCode());
    }

    @Test
    public void getCharge() {
        Movie movie = new ChildrensPrice("Fast", priceCode);
        assertEquals(expected, movie.getCharge(2), 0.0);
    }

    @Test
    public void getFrequentRenterPoints() {
    }
}
