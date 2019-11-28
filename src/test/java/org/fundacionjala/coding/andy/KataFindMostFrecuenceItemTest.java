package org.fundacionjala.coding.andy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author lazaro on 11/27/2019.
 * coding
 */
public class KataFindMostFrecuenceItemTest {

    @Test
    public void mostFrequentItemCount() {
        assertEquals(2, KataFrecuenceItem.mostFrequentItemCount(new int[] {3, -1, -1}));
        assertEquals(5, KataFrecuenceItem.mostFrequentItemCount(
                new int[] {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
    }
}
