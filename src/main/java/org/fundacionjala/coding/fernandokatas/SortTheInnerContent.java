package org.fundacionjala.coding.fernandokatas;

import java.util.Arrays;

public final class SortTheInnerContent {
    private SortTheInnerContent() {
    }

    public static String sortTheInnerContent(final String words) {
        StringBuilder result = new StringBuilder();
        String[] sortWord = words.split(" ");
        for (int i = 0; i < sortWord.length; i++) {
            revertInnerWord(sortWord[i], result);
            if (i < sortWord.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void revertInnerWord(final String word, final StringBuilder result) {
        int size = word.length() - 1;
        if (word.length() >= 2) {
            result.append(word.charAt(0));
            char[] test = word.substring(1, size).toCharArray();
            descOrder(test);
            result.append(test);
            result.append(word.charAt(size));
        } else {
            if (word.length() == 1) {
                result.append(word.charAt(size));
            }
        }
    }

    public static void descOrder(final char[] descOrder) {
        Arrays.sort(descOrder);
        int size = descOrder.length;
        char temp;
        for (int i = 0; i < size / 2; i++) {
            temp = descOrder[i];
            descOrder[i] = descOrder[size - i - 1];
            descOrder[size - i - 1] = temp;
        }
    }
}

