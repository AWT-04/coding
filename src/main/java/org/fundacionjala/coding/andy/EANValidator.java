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
        for (int i = 1; i <= (eanCode.length() - 1); i++) {
            int factor = i % 2 == 0 ? constant2 : 1;
            sum += (Character.getNumericValue(eanCode.charAt(i - 1)) * factor);
        }
        sum = constant - (sum % constant);
        if (sum >= constant) {
            sum = sum % constant;
        }
        return (Character.getNumericValue(eanCode.charAt((eanCode.length() - 1))) == sum);
    }
}
