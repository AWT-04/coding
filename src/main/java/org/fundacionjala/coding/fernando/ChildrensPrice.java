package org.fundacionjala.coding.fernando;

public class ChildrensPrice extends Movie {
    private static final double CHILDRENPRICE = 1.5;
    private static final int DAYS = 3;
    public ChildrensPrice(final String title) {
        super(title);
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 0;
        if (daysRented > DAYS) {
            result += (daysRented - DAYS) * CHILDRENPRICE;
        }
        return result;
    }
}
