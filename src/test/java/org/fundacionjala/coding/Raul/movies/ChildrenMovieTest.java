package org.fundacionjala.coding.Raul.movies;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChildrenMovieTest {
    ChildrenMovie childrenMovie = new ChildrenMovie("Lion", 13);
    @Test
    public void statement() {
        double thisAmount = 0;
        thisAmount += 1.5;
        Assert.assertTrue(thisAmount==1.5);
    }

    @Test
    public void GetTitleWithConstructor(){
        Assert.assertEquals(childrenMovie.getTitle(), "Lion");
    }

    @Test
    public void GetPriceWithConstructor(){
        Assert.assertEquals(childrenMovie.getPriceCode(), 13);
    }
}