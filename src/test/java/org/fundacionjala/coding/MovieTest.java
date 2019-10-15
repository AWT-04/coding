package movies;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MovieTest {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;
    private int _priceCode;

    @Test(expected = AssertionError.class)
    public void getPriceCode() {

        assertEquals(_priceCode,5);
    }

    @Test(expected = AssertionError.class)
    public void setPriceCode() {
        int arg = 3;
        _priceCode = CHILDRENS * REGULAR * NEW_RELEASE;
        assertEquals(_priceCode, arg);
    }

    @Test(expected = AssertionError.class)
    public void getTitle() {
        _title = null;
        assertEquals(_title,"Title");
    }
}