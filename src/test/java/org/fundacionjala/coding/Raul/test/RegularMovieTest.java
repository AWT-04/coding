package org.fundacionjala.coding.Raul.test;

import org.fundacionjala.coding.raul.movies.RegularMovie;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RegularMovieTest {
    private static final int PRICE = 30;
    private static final double INCREMENT = 1.5;
    private RegularMovie regularMovie;

    @Before
    public void setup(){
        regularMovie = new RegularMovie("Lion", PRICE);
    }

    @Test
    public void statement() {
        double value = regularMovie.statement();
        Assert.assertTrue(value == INCREMENT);
    }

    @Test
    public void getTitleWithConstructor() {
        Assert.assertEquals("Lion", regularMovie.getTitle());
    }

    @Test
    public void getPriceWithConstructor() {
        Assert.assertEquals(PRICE, regularMovie.getPriceCode());
    }
}
