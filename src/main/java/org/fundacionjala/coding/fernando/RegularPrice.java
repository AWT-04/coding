package org.fundacionjala.coding.fernando;

public class RegularPrice extends Movie {
    private static final double REGULARVAR = 1.5;

    public RegularPrice(final String title) {
        super(title);
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2) {
            result += (daysRented - 2) * REGULARVAR;
        }
        return result;
    }
}
