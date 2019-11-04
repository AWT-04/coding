package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class DnaStrandTest {
    @Test
    public void test01() {
        assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
    }
}