package org.fundacionjala.coding.movies.andy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MovieTest {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private final int arg = 3;
    private String title;
    private int priceCode;

    @Test(expected = AssertionError.class)
    public void getPriceCode() {
        assertEquals(CHILDRENS, this.priceCode);
    }

    @Test(expected = AssertionError.class)
    public void setPriceCode() {
        this.priceCode = CHILDRENS * REGULAR * NEW_RELEASE;
        assertEquals(this.priceCode, arg);
    }

    @Test(expected = AssertionError.class)
    public void getTitle() {
        this.title = null;
        assertEquals("Title", this.title);
    }
}
