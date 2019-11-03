package org.fundacionjala.coding.fernandokatas;

import java.util.HashMap;

public final class DnaStrand {
    private DnaStrand() {
    }

    public static String makeComplement(final String dna) {
        String dnaResult = dna.toUpperCase();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('T', 'A');
        map.put('A', 'T');
        map.put('C', 'G');
        map.put('G', 'C');
        int size = dna.length();
        char[] result = dnaResult.toCharArray();
        for (int i = 0; i < size; i++) {
            result[i] = map.get(result[i]);
        }
        return String.valueOf(result);
    }
}
