package org.fundacionjala.coding.Raul.movies;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularMovieTest {

    RegularMovie regularMovie = new RegularMovie("The king", 15);

    @Test
    public void statement() {
        double thisAmount = 0;
        thisAmount += 1.5;
        Assert.assertTrue(thisAmount==1.5);
    }

    @Test
    public void GetTitleWithConstructor(){
        Assert.assertEquals(regularMovie.getTitle(), "The king");
    }

    @Test
    public void GetPriceWithConstructor(){
        Assert.assertEquals(regularMovie.getPriceCode(), 15);
    }
}