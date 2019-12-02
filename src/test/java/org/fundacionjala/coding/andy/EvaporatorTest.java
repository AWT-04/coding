package org.fundacionjala.coding.andy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvaporatorTest {
    private final int expected = 22;
    private final int evapPerDay = 10;
    private final int content = 10;
    private final int threshold = 10;
    @Test
    public void testEvaporatorOne() {
        assertEquals(expected, Evaporator.evaporator(content, evapPerDay, threshold));
    }
}
