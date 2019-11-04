package org.fundacionjala.coding.Raul.test;

import org.fundacionjala.coding.raul.movies.ChildrenMovie;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChildrenMovieTest {
    private static final int PRICE = 13;
    private static final int PRICECODE = 13;
    private static final double INCREMENT = 1.5;
    private ChildrenMovie childrenMovie;

    @Before
    public void setup() {
        childrenMovie = new ChildrenMovie("Lion", PRICE);
    }

    @Test
    public void statement() {
        double value = childrenMovie.statement();
        Assert.assertTrue(value == INCREMENT);
    }

    @Test
    public void getTitleWithConstructor() {
        Assert.assertEquals("Lion", childrenMovie.getTitle());
    }

    @Test
    public void getPriceWithConstructor() {
        Assert.assertEquals(PRICECODE, childrenMovie.getPriceCode());
    }
}
