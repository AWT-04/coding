package org.fundacionjala.coding.fernando;

public class NewReleasePrice extends Movie {
    private final int days = 3;
    public NewReleasePrice(final String title, int priceCode) {
        super(title, priceCode);
    }
    @Override
    public int getPriceCode() {
        return NEW_RELEASE;
    }
    @Override
    public double getCharge(int daysRented) {
        return daysRented * days;
    }
    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
