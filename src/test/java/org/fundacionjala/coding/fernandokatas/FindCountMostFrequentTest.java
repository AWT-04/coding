package org.fundacionjala.coding.fernandokatas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindCountMostFrequentTest {
    private static final int TRES = 3;
    private static final int CUATRO = 4;
    private static final int CINCO = 5;
    private static final int NUEVE = 9;

    @Test
    public void test01() {
        assertEquals(CINCO, FindCountMostFrequent.findCount(new int[]
                {TRES, -1, -1, -1, 2, TRES, -1, TRES, -1, 2, CUATRO, NUEVE, TRES}));
        assertEquals(2, FindCountMostFrequent.findCount(new int[]
                {TRES, -1, -1}));
    }
}
