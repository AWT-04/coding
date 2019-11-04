package org.fundacionjala.coding.andy;

/**
 * @author lazaro on 10/28/2019.
 * coding.
 */
public final class DnaStrand {
    private DnaStrand() { }

    public static String makeComplement(final String dna) {
        String dna1 = dna.replace("A", "X");
        dna1 = dna1.replace("T", "A");
        dna1 = dna1.replace("X", "T");
        dna1 = dna1.replace("C", "X");
        dna1 = dna1.replace("G", "C");
        dna1 = dna1.replace("X", "G");
        return dna1;
    }
}
