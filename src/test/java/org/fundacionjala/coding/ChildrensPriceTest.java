package movies;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChildrensPriceTest {

    @Test
    public void getPriceCode() {
        Movie movie = new ChildrensPrice("Fast",7);
        assertEquals(2,movie.getPriceCode());
    }

    @Test
    public void getCharge() {
        Movie movie = new ChildrensPrice("Fast",7);
        assertEquals(4.5, movie.getCharge(5), 0.0);
    }
}