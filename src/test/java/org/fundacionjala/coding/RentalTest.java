package movies;

import org.fundacionjala.coding.fernando.ChildrensPrice;
import org.fundacionjala.coding.fernando.Movie;
import org.fundacionjala.coding.fernando.NewReleasePrice;
import org.fundacionjala.coding.fernando.Rental;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RentalTest {
    private final int priceCode = 15;
    private final double expected = 5;
    private final int days = 10;

    @Test(expected = AssertionError.class)
    public void getDaysRented() {
        Movie movie = new NewReleasePrice("Fast", priceCode);
        Rental rental = new Rental(movie, days);
        assertTrue(rental.getDaysRented() == expected);
    }

    @Test
    public void getMovie() {
        Movie movie = new ChildrensPrice("Fast", priceCode);
        Rental rental = new Rental(movie, days);
        assertTrue(rental.getMovie() == movie);
    }
}
