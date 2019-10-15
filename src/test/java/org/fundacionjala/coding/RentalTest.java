package movies;

import org.junit.Test;

import static org.junit.Assert.*;

public class RentalTest {
    private Movie _movie;
    private int _daysRented;

    @Test
    public void getDaysRented() {
        _daysRented = 2;
        assertNotEquals(_daysRented, 5.22);
    }

    @Test(expected = NullPointerException.class)
    public void getMovie() {
        _movie.getClass().getName();
        assertNotEquals(_movie,"Movie");
    }
}
