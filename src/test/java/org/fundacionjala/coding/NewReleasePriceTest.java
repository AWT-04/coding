package org.fundacionjala.coding;

import org.fundacionjala.coding.fernando.ChildrensPrice;
import org.fundacionjala.coding.fernando.Movie;
import org.fundacionjala.coding.fernando.NewReleasePrice;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewReleasePriceTest {
    private static final int PRICECODE = 7;
    private static final double EXPECTED = 0.0;

    @Test
    public void getPriceCode() {
        Movie movie = new NewReleasePrice("Fast", PRICECODE);
        assertEquals(1, movie.getPriceCode());
    }

    @Test
    public void getCharge() {
        Movie movie = new ChildrensPrice("Fast", PRICECODE);
        assertEquals(EXPECTED, movie.getCharge(2), 0.0);
    }
}
