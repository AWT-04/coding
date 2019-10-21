package org.fundacionjala.coding.movies.andy;

import org.junit.Test;

import java.util.Vector;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CustomerTest {
    private String name;
    private Vector rentals = new Vector();

    @Test
    public void addRental() {
        ChildrenMovie movie = new ChildrenMovie("Test1", 1);
        Rental arg = new Rental(movie, 2);
        rentals.addElement(arg);
        assertNotEquals(rentals, null);
    }

    @Test (expected = AssertionError.class)
    public void getName() {
        name = "Test";
        assertEquals(" ", name);
    }
    @Test
    public void statement() {

        assertNotEquals("ss", "dd");
    }
}
