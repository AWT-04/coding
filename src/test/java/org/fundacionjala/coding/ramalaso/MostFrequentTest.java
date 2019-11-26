package org.fundacionjala.coding.ramalaso;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MostFrequentTest {
    private static final  int TRES = 3;
    private  static final  int CUATRO = 4;
    private static final int CINCO = 5;
    private static final int NUEVE = 9;

    @Test
    public void tests() {
        assertEquals(2, MostFrequent.mostFrequentItemCount(new int[]
                {TRES, -1, -1}));
        assertEquals(CINCO, MostFrequent.mostFrequentItemCount(new int[]
                {TRES, -1, -1, -1, 2, TRES, -1, TRES, -1, 2, CUATRO, NUEVE, TRES}));
    }
}
