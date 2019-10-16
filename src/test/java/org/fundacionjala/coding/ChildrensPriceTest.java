package org.fundacionjala.coding;

import org.fundacionjala.coding.fernando.ChildrensPrice;
import org.fundacionjala.coding.fernando.Movie;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChildrensPriceTest {
    private final int price = 7;
    private final int days = 5;
    private final double expected = 3.0;

    @Test
    public void getPriceCode() {
        ChildrensPrice movie = new ChildrensPrice("Fast", price);
        assertEquals(2, movie.getPriceCode());
    }

    @Test
    public void getCharge() {
        Movie movie = new ChildrensPrice("Fast", price);
        assertEquals(expected, movie.getCharge(days), 0.0);
    }
}
