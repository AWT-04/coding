package com.company;

public class EANValidator {

    private EANValidator() {
    }

    public static boolean validate(final String eanCode) {
        int sum = 0;
        int num = 0;
        for (int i = 0; i < eanCode.length()-1; i++) {
            num = Integer.parseInt(String.valueOf(eanCode.charAt(i)));
            sum = i % 2 == 0 ?  sum + num*1 : sum + num*3;
        }
        int chesumCalculated = 10 - sum % 10 <= 9 ? 10 - sum % 10 : 0;
        int lastValue = Integer.parseInt(String.valueOf(eanCode.charAt(eanCode.length()-1)));
        return chesumCalculated == lastValue;
    }
}