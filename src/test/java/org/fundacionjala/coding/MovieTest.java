package movies;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    @Test
    public void getPriceCode() {
        Movie movie = new RegularPrice("Fast",15);
        assertEquals(15,movie.getPriceCode());
    }

    @Test
    public void setPriceCode() {
        Movie movie = new RegularPrice("Fast",15);
        movie.setPriceCode(25);
        assertEquals(25,movie.getPriceCode());
    }

    @Test
    public void getTitle() {
        Movie movie = new RegularPrice("Fast",15);
        assertEquals("Fast",movie.getTitle());
    }
}