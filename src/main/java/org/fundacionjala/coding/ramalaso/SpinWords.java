package org.fundacionjala.coding.ramalaso;

import java.util.regex.Pattern;

public final class SpinWords {

    private SpinWords() {
    }

    public static String spinWords(final String sentence) {
        final int size = 5;

        Pattern pattern = Pattern.compile("\\s");


        String[] words = pattern.split(sentence);
        String wordsReturn = "";
        for (String word: words) {
            if (word.length() >= size) {
                word = reverseWord(word);
            }
            wordsReturn += " " + word;
        }
        return wordsReturn.trim();
    }

    private static String reverseWord(final String word) {
        String revWord = "";
        for (int j = word.length() - 1; j >= 0; j--) {
            revWord = revWord + word.charAt(j);
        }
        return revWord;
    }
}
