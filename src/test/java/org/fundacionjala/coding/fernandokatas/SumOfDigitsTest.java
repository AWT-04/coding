package org.fundacionjala.coding.fernandokatas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfDigitsTest {
    private static final int SEVEN = 7;
    private static final int SIX = 6;
    private static final int TWO = 2;
    private static final int SIXTEEN = 16;
    private static final int NUMBER1 = 942;
    private static final int NUMBER2 = 132189;
    private static final int NUMBER3 = 493193;

    @Test
    public void sumDigitTests() {
        assertEquals(SEVEN, SumOfDigits.sumOfDigits(SIXTEEN));
        assertEquals(SIX, SumOfDigits.sumOfDigits(NUMBER1));
        assertEquals(SIX, SumOfDigits.sumOfDigits(NUMBER2));
        assertEquals(TWO, SumOfDigits.sumOfDigits(NUMBER3));
    }
}
