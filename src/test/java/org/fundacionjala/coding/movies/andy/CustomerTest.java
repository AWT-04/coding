package org.fundacionjala.coding.movies.andy;

import org.junit.Test;
import java.util.ArrayList;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author lazaro on 11/5/2019.
 * coding.
 */
public class CustomerTest {
    private String name;
    private ArrayList<Rental> rentals;
    private Rental each;

    @Test
    public void addRental() {
        this.rentals = new ArrayList<>();
        ChildrenMovie movie = new ChildrenMovie("Test1", 1);
        Rental arg = new Rental(movie, 2);
        this.rentals.add(arg);
        assertNotEquals(this.rentals, null);
    }

    @Test (expected = AssertionError.class)
    public void getName() {
        this.name = "Test";
        assertEquals(" ", name);
    }

    @Test(expected = AssertionError.class)
    public void amount() {
        NewReleaseMovie movie = new NewReleaseMovie("Test1", 1);
        each = new Rental(movie, 2);
        assertEquals(each.statement(movie), 2);
        assertNotNull(each.getMovie().getTitle());
        assertEquals(each.frequentRenterPoints(movie),1);
    }

    @Test
    public void referencePoints() {
        RegularMovie movie = new RegularMovie("Test1", 1);
        each = new Rental(movie, 2);
        assertEquals(each.frequentRenterPoints(movie), 1);
        assertEquals(each.getMovie().getClass().getSimpleName(),"RegularMovie");
    }

//    @Test
//    public void statement() {
//    }
}
