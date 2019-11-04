package org.fundacionjala.coding.Raul.test;

import org.fundacionjala.coding.raul.movies.NewReleaseMovie;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NewReleaseMovieTest {
    private static final int PRICE = 30;
    public static final double INCREMENT = 1.5;
    private NewReleaseMovie newReleaseMovie;

    @Before
    public void setup() {
        newReleaseMovie = new NewReleaseMovie("The lion king", PRICE);
    }

    @Test
    public void statement() {
        double value = newReleaseMovie.statement();
        Assert.assertTrue(value == 0);
    }

    @Test
    public void getTitleWithConstructor() {
        Assert.assertEquals("The lion king", newReleaseMovie.getTitle());
    }

    @Test
    public void getPriceWithConstructor() {
        Assert.assertEquals(PRICE, newReleaseMovie.getPriceCode());
    }
}
