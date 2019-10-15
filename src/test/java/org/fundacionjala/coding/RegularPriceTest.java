package movies;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegularPriceTest {

    @Test
    public void getPriceCode() {
        Movie movie = new RegularPrice("Fast",3);
        assertEquals(0,movie.getPriceCode());
    }

    @Test
    public void getCharge() {
        Movie movie = new RegularPrice("Fast",7);
        assertNotEquals(4.5, movie.getCharge(5), 0.0);
    }
}