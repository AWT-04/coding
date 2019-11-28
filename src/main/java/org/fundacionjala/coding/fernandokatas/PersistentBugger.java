package org.fundacionjala.coding.fernandokatas;

public final class PersistentBugger {
    private static final int TEN = 10;

    private PersistentBugger() {
    }

    public static int persistent(int number) {
        int count = 0;
        if (number >= TEN) {
            while (number >= TEN) {
                number = multiplyDigit(number);
                count++;
            }
            return count;
        }
        return 0;
    }

    public static int multiplyDigit(int digit) {
        int result = 1;
        while (digit >= 1) {
            result *= digit % TEN;
            digit = digit / TEN;
        }
        return result;
    }
}
