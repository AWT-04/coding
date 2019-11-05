package org.fundacionjala.coding.fernandokatas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringJoiner;

public final class SortTheInnerContent {
    private SortTheInnerContent() {
    }

    public static String sortTheInnerContent(String words) {
        String[] sortWord = words.split(" ");
        StringJoiner join = new StringJoiner(" ");
        String[] result;
        for (String listWord : sortWord) {
            result = listWord.split("");
            if (result.length > 3) {
                Arrays.sort(result, 1, result.length - 1,
                        Collections.reverseOrder());
            }
            join.add(String.join("", result));

        }
        return join.toString();
    }
}

