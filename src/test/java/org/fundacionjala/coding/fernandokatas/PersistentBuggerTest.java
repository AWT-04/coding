package org.fundacionjala.coding.fernandokatas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersistentBuggerTest {
    private static final int FOUR = 4;
    private static final int THREE = 3;
    private static final int NUMBER1 = 39;
    private static final int NUMBER2 = 999;

    @Test
    public void sumDigitTests() {
        assertEquals(THREE, PersistentBugger.persistent(NUMBER1));
        assertEquals(FOUR, PersistentBugger.persistent(NUMBER2));
        assertEquals(0, PersistentBugger.persistent(FOUR));
    }
}
