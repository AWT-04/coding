package movies;

import org.junit.Test;

import static org.junit.Assert.*;

public class NewReleasePriceTest {

    @Test
    public void getPriceCode() {
        Movie movie = new NewReleasePrice("Fast",7);
        assertEquals(1,movie.getPriceCode());
    }

    @Test
    public void getCharge() {
        Movie movie = new ChildrensPrice("Fast",7);
        assertEquals(1.5, movie.getCharge(2), 0.0);
    }

    @Test
    public void getFrequentRenterPoints() {
    }
}