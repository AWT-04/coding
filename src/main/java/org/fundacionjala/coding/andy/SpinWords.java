package org.fundacionjala.coding.andy;

public class SpinWords {
    private final int chars = 4;
    public String spinWords(final String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > chars) {
                words[i] = spin(words[i]);
            }
        }
        return String.join(" ", words);
    }
    public String spin(final String word) {
        String word2 = "";

        for (int i = word.length(); i > 0; i--) {
            word2 = word2 + word.charAt(i - 1);
        }
        return word2;
    }
}
