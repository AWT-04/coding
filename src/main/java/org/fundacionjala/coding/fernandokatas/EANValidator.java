package org.fundacionjala.coding.fernandokatas;

public final class EANValidator {
    private static final int EAN = 3;
    private static final int MOD = 10;

    private EANValidator() {
    }

    public static boolean validate(final String eanCode) {
        int suma = 0;
        char[] result = eanCode.toCharArray();
        int size = eanCode.length() / 2;
        for (int i = 1; i <= size; i++) {
            suma += Character.getNumericValue(result[2 * i]) * EAN
                    + Character.getNumericValue(result[2 * i - 1]);
        }
        return suma % MOD != 0 && suma >= MOD;
    }
}
