package org.fundacionjala.coding.Raul.test;

import org.fundacionjala.coding.raul.movies.RegularMovie;
import org.junit.Assert;
import org.junit.Test;

public class RegularMovieTest {

    RegularMovie regularMovie = new RegularMovie("The king", 15);

    @Test
    public void statement() {
        double thisAmount = 0;
        thisAmount += 1.5;
        Assert.assertTrue(thisAmount==1.5);
    }

    @Test
    public void getTitleWithConstructor(){
        Assert.assertEquals(regularMovie.getTitle(), "The king");
    }

    @Test
    public void getPriceWithConstructor(){
        Assert.assertEquals(regularMovie.getPriceCode(), 15);
    }
}