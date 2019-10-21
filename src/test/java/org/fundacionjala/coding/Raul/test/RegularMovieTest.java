package org.fundacionjala.coding.Raul.test;

import org.fundacionjala.coding.raul.movies.RegularMovie;
import org.junit.Assert;
import org.junit.Test;

public class RegularMovieTest {
    private static final int PRICE = 30;
    public static final double INCREMENT = 1.5;

    private final RegularMovie regularMovie = new RegularMovie("The king", PRICE);

    @Test
    public void statement() {
        double thisAmount = 0;
        thisAmount += INCREMENT;
        Assert.assertTrue(thisAmount == INCREMENT);
    }

    @Test
    public void getTitleWithConstructor() {
        Assert.assertEquals("The king", regularMovie.getTitle());
    }

    @Test
    public void getPriceWithConstructor() {
        Assert.assertEquals( PRICE, regularMovie.getPriceCode());
    }
}
