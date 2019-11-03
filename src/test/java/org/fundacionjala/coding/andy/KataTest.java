package org.fundacionjala.coding.andy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author lazaro on 10/31/2019.
 * coding
 */
public class KataTest {
    @Test
    public void exampleTests() {
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr",
                Kata.sortTheInnerContent("sort the inner content in descending order"));
        assertEquals("wiat for me", Kata.sortTheInnerContent("wait for me"));
        assertEquals("tihs ktaa is esay", Kata.sortTheInnerContent("this kata is easy"));
    }
}
