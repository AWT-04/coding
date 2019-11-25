package org.fundacionjala.coding.fernando;

public class NewReleasePrice extends Movie {
    private static final double DAYS = 3;
    public NewReleasePrice(final String title) {
        super(title);
    }
    @Override
    public double getCharge(int daysRented) {
        return daysRented * DAYS;
    }
    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
