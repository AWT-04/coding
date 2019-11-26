package org.fundacionjala.coding.ramalaso;

public final class Evaporator {

    public static final int CIEN = 100;
    private Evaporator() {
    }

    public static int evaporator(double content, double evapPerDay, double threshold) {
        // your code
        int n = 0;
        double valueThreshold = threshold / CIEN * content;
        while (valueThreshold <= content) {
            content = content - content * evapPerDay / CIEN;
            n++;
        }
        return n;
    }
}
