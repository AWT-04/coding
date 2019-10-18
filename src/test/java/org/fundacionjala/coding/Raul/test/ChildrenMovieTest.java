package org.fundacionjala.coding.Raul.test;

import org.fundacionjala.coding.raul.movies.ChildrenMovie;
import org.junit.Assert;
import org.junit.Test;

public class ChildrenMovieTest {
    ChildrenMovie childrenMovie = new ChildrenMovie("Lion", 13);
    @Test
    public void statement() {
        double thisAmount = 0;
        thisAmount += 1.5;
        Assert.assertTrue(thisAmount==1.5);
    }

    @Test
    public void getTitleWithConstructor(){
        Assert.assertEquals(childrenMovie.getTitle(), "Lion");
    }

    @Test
    public void getPriceWithConstructor(){
        Assert.assertEquals(childrenMovie.getPriceCode(), 13);
    }
}