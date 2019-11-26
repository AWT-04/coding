package org.fundacionjala.coding.ramalaso;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvaporatorTest {
    private static final int EXPTECTED = 22;
    private static final int CONTENT = 10;
    @Test
    public void testEvaporatorOne() {
        assertEquals(EXPTECTED, Evaporator.evaporator(CONTENT, CONTENT, CONTENT));
    }
}
