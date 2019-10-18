package org.fundacionjala.coding.Raul.test;

import org.fundacionjala.coding.raul.movies.NewReleaseMovie;
import org.junit.Assert;
import org.junit.Test;

public class NewReleaseMovieTest {
    NewReleaseMovie newReleaseMovie = new NewReleaseMovie("The lion king", 30);
    @Test
    public void statement() {
        double thisAmount = 0;
        thisAmount += 1.5;
        Assert.assertTrue(thisAmount==1.5);
    }

    @Test
    public void getTitleWithConstructor(){
        Assert.assertEquals(newReleaseMovie.getTitle(), "The lion king");
    }

    @Test
    public void getPriceWithConstructor(){
        Assert.assertEquals(newReleaseMovie.getPriceCode(), 30);
    }
}