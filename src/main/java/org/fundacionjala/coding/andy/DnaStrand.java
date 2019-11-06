package org.fundacionjala.coding.andy;

/**
 * @author lazaro on 10/28/2019.
 * coding.
 */
public final class DnaStrand {
    private DnaStrand() { }

    public static String makeComplement(final String dna) {
        return dna.replace("A", "X")
        .replace("T", "A")
        .replace("X", "T")
        .replace("C", "X")
        .replace("G", "C")
        .replace("X", "G");
    }
}
