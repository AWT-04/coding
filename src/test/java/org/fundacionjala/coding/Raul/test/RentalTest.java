package org.fundacionjala.coding.Raul.test;

import org.fundacionjala.coding.raul.movies.ChildrenMovie;
import org.fundacionjala.coding.raul.movies.Movie;
import org.fundacionjala.coding.raul.movies.Rental;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RentalTest {

    private ChildrenMovie movie = new ChildrenMovie("The Lion King", 1);
    private Rental rental = new Rental(movie, 5);
    @Test
    public void getDaysRented() {
        Assert.assertEquals(5, rental.getDaysRented());
    }

    @Test
    public void getMovie() {
        Assert.assertEquals(new ChildrenMovie("The Lion King", 1).getTitle(), movie.getTitle());
    }

}