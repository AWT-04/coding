package org.fundacionjala.coding.fernandokatas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighAndLowTest {
    @Test
    public void testHighAndLow() {
//        assertEquals("5 1", HighAndLow.highAndLow("1 2 3 4 5"));
//        assertEquals("5 -3", HighAndLow.highAndLow("1 2 -3 4 5"));
//        assertEquals("9 -5", HighAndLow.highAndLow("1 9 3 4 -5"));
        assertEquals("42 -9", HighAndLow.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
