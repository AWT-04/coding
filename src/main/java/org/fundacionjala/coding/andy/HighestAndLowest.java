package org.fundacionjala.coding.andy;

public final class HighestAndLowest {
    private HighestAndLowest() {
    }
    public static String highAndLow(final String numbers) {
        String[] listNumber = numbers.split(" ");
        int max = Integer.parseInt(listNumber[0]);
        int min = Integer.parseInt(listNumber[0]);
        for (int i = 0; i < listNumber.length; i++) {
            if (max < Integer.parseInt(listNumber[i])) {
                max = Integer.parseInt(listNumber[i]);
            }
            if (min > Integer.parseInt(listNumber[i])) {
                min = Integer.parseInt(listNumber[i]);
            }
        }
        return max + " " + min;
    }
}
