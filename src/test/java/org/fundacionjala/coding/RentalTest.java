package movies;

import jdk.management.resource.internal.ResourceNatives;
import org.junit.Test;

import static org.junit.Assert.*;

public class RentalTest {

    @Test (expected = AssertionError.class)
    public void getDaysRented() {
        Movie movie = new NewReleasePrice("Fast",15);
        Rental rental = new Rental(movie,10);
        assertTrue(rental.getDaysRented() == 5);
    }

    @Test
    public void getMovie() {
        Movie movie = new ChildrensPrice("Fast",15);
        Rental rental = new Rental(movie,10);
        assertTrue(rental.getMovie()==movie);
    }
}