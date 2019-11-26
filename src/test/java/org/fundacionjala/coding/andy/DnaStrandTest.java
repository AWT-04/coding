package org.fundacionjala.coding.andy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author lazaro on 10/28/2019.
 *
 */
public class DnaStrandTest {
    @Test
    public void test01() {
        assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
    }
    @Test
    public void test02() {
        assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
    }
    @Test
    public void test03() {
        assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
    }
}
