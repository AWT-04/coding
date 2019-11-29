package org.fundacionjala.coding.andy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author lazaro on 11/27/2019.
 * coding
 */
public class KataFindMostFrecuenceItemTest {
    private final int[] array1 = new int[] {3, -1, -1};
    private final int[] array2 = new int[] {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
    private final int expected1 = 2;
    private final int expected2 = 5;

    @Test
    public void mostFrequentItemCount() {

        assertEquals(expected1, KataFrecuenceItem.mostFrequentItemCount(array1));
        assertEquals(expected2, KataFrecuenceItem.mostFrequentItemCount(array2));
    }
}
