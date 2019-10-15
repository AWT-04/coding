package movies;

import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;

public class CustomerTest {
    private String name;
    private Vector _rentals = new Vector();

    @Test
    public void addRental() {
        ChildrenMovie movie = new ChildrenMovie("Test1",1);
        Rental arg = new Rental(movie,2);
        _rentals.addElement(arg);
        assertNotEquals(_rentals,null);
    }

    @Test (expected = AssertionError.class)
    public void getName() {
        name = "Test";
        assertEquals(name, " ");
    }
    @Test
    public void statement() {
        assertNotEquals("ss","dd");
    }
}