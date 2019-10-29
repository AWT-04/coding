package org.fundacionjala.coding.andy;

/**
 * @author lazaro on 10/28/2019.
 *
 */
public final class DnaStrand {
    private DnaStrand() { }

    public static String makeComplement(final String dna) {
        StringBuilder bld = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            switch (dna.charAt(i)) {
                case 'T':
                    bld.append('A');
                    break;
                case 'A':
                    bld.append('T');
                    break;
                case 'C':
                    bld.append('G');
                    break;
                case 'G':
                    bld.append('C');
                    break;
                default:
                    bld.append(dna.charAt(i));
                    break;
            }
        }
        return bld.toString();
    }
}
