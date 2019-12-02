package org.fundacionjala.coding.andy;

public final class Evaporator {
    private static final int BASE = 100;
    private Evaporator() { }
    public static int evaporator(double content, double evaPerDay, double threshold) {
        int daysToEvaporate = 0;
        double valueThreshold = threshold / BASE * content;
        while (valueThreshold <= content) {
            content = content - content * evaPerDay / BASE;
            daysToEvaporate++;
        }
        return daysToEvaporate;
    }
}

