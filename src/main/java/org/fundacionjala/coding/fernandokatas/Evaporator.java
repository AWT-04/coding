package org.fundacionjala.coding.fernandokatas;

public final class Evaporator {
    public static final int STATE = 100;

    private Evaporator() {
    }

    public static int evaporator(double content, final double evapPerDay, final double threshold) {
        int timeToUse = 0;
        double value = threshold / STATE * content;
        while (value <= content) {
            content -= content * evapPerDay / STATE;
            timeToUse++;
        }
        return timeToUse;
    }
}
