package com.jalasoft.tests;

import com.jalasoft.models.Movie;
import com.jalasoft.models.Price;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {
    Movie movie = new Movie("Grinch");

    @Test
    public void getPriceCode() {
        assertEquals("Grinch", movie.getTitle());
    }

    @Test
    public void getTitle() {
        assertEquals(13, price.getPriceCode());
    }
}