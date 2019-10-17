package org.fundacionjala.coding;

import org.fundacionjala.coding.fernando.ChildrensPrice;
import org.fundacionjala.coding.fernando.Movie;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChildrensPriceTest {
    private static final int PRICE = 7;
    private static final int DAYS = 5;
    private static final double EXPECTED = 3.0;

    @Test
    public void getPriceCode() {
        ChildrensPrice movie = new ChildrensPrice("Fast", PRICE);
        assertEquals(2, movie.getPriceCode());
    }

    @Test
    public void getCharge() {
        Movie movie = new ChildrensPrice("Fast", PRICE);
        assertEquals(EXPECTED, movie.getCharge(DAYS), 0.0);
    }
}
