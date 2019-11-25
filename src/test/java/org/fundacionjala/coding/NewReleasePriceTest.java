package org.fundacionjala.coding;

import org.fundacionjala.coding.fernando.ChildrensPrice;
import org.fundacionjala.coding.fernando.Movie;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewReleasePriceTest {
    private static final double EXPECTED = 0.0;

    @Test
    public void getCharge() {
        Movie movie = new ChildrensPrice("Fast");
        assertEquals(EXPECTED, movie.getCharge(2), 0.0);
    }
}
