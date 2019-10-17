package org.fundacionjala.coding;

import org.fundacionjala.coding.fernando.ChildrensPrice;
import org.fundacionjala.coding.fernando.Movie;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChildrensPriceTest {
    private static final int DAYS = 5;
    private static final double EXPECTED = 3.0;

    @Test
    public void getCharge() {
        Movie movie = new ChildrensPrice("Fast");
        assertEquals(EXPECTED, movie.getCharge(DAYS), 0.0);
    }
}
