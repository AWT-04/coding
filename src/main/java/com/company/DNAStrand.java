package com.company;

class DnaStrand {
    private DnaStrand() {
    }

    public static String makeComplement(String dna) {
        String base = "ATCG";
        String complements = "TAGC";
        char element;
        StringBuilder dnaComplement = new StringBuilder();
        int index;
        for (int i = 0; i < dna.length(); i++) {
            element = dna.charAt(i);
            index = base.indexOf(element);
            dnaComplement.append(String.valueOf(complements.charAt(index)));
        }
        return dnaComplement.toString();
    }
}
