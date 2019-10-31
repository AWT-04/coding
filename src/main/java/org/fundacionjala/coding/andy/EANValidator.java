package org.fundacionjala.coding.andy;

/**
 * @author lazaro on 10/29/2019.
 * coding.
 */
public final class EANValidator {
    private EANValidator() { }

    public static boolean validate(final String eanCode) {
        int sum = 0;
        final int constant = 10;
        final int constant2 = 3;
        boolean band = false;
        for (int i = 1; i <= (eanCode.length() - 1); i++) {
            int factor = 1;
            if (i % 2 == 0) {
                factor = constant2;
            }
            sum = sum +  (Character.getNumericValue(eanCode.charAt(i - 1)) * factor);
        }
        sum = constant - (sum % constant);
        if (sum >= constant) {
            sum = sum % constant;
        }
        if (Character.getNumericValue(eanCode.charAt((eanCode.length() - 1))) == sum) {
            band = true;
        }
        return band;
    }
}
