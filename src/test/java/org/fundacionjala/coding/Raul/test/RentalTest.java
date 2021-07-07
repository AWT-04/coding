package org.fundacionjala.coding.Raul.test;

import org.fundacionjala.coding.raul.movies.ChildrenMovie;
import org.fundacionjala.coding.raul.movies.Rental;
import org.junit.Assert;
import org.junit.Test;

public class RentalTest {

    private final int days = 5;
    private final int price = 1;
    private ChildrenMovie movie = new ChildrenMovie("The Lion King", price);
    private Rental rental = new Rental(movie, days);
    @Test
    public void getDaysRented() {
        Assert.assertEquals(days, rental.getDaysRented());
    }

    @Test
    public void getMovie() {
        Assert.assertEquals(new ChildrenMovie("The Lion King", price).getTitle(), movie.getTitle());
    }

}
