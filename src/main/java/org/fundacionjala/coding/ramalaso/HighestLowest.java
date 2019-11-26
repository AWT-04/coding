package org.fundacionjala.coding.ramalaso;

import java.util.Arrays;

public final class HighestLowest {

    private HighestLowest() {
    }

    public static String maximumMinimum(final String numbers) {
        String[] strNumbers = numbers.split(" ");
        int[] intNumbers = new int[strNumbers.length];
        for (int i = 0; i < strNumbers.length; i++) {
            intNumbers[i] = Integer.parseInt(strNumbers[i]);
        }
        Arrays.sort(intNumbers);
        return String.format("%s %s", intNumbers[intNumbers.length - 1], intNumbers[0]);
    }
}
