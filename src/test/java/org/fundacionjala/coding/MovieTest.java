package org.fundacionjala.coding;

import org.fundacionjala.coding.fernando.Movie;
import org.fundacionjala.coding.fernando.RegularPrice;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void getTitle() {
        Movie movie = new RegularPrice("Fast");
        assertEquals("Fast", movie.getTitle());
    }
}
