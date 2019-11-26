package org.fundacionjala.coding.fernandokatas;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;

public final class SpinWords {
    private static final int SIZE = 4;

    private SpinWords() {

    }

    public static String spinWords(final String sentence) {
        String[] sortWord = sentence.split(" ");
        StringJoiner join = new StringJoiner(" ");
        String[] result;
        for (String listWord : sortWord) {
            result = listWord.split("");
            if (result.length > SIZE) {
                Collections.reverse(Arrays.asList(result));
            }
            join.add(String.join("", result));
        }
        return join.toString();
    }
}
