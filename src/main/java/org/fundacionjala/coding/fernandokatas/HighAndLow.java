package org.fundacionjala.coding.fernandokatas;

import java.util.Arrays;

public final class HighAndLow {
    private HighAndLow() {
    }

    public static String highAndLow(final String input) {
        String[] sortWord = input.split(" ");
        int[] result = Arrays.stream(sortWord).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(result);
        return result[result.length - 1] + " " + result[0];
    }
}

