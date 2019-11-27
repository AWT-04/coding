package org.fundacionjala.coding.fernandokatas;

public final class SumOfDigits {
    private static final int TEN = 10;

    private SumOfDigits() {
    }

    public static int sumOfDigits(int number) {
        int result = number >= TEN ? number % TEN + sumOfDigits(number / TEN) : number;
        if (result >= TEN) {
            return result % TEN + sumOfDigits(result / TEN);
        }
        return result;
    }
}
