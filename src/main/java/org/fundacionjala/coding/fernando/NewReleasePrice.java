package org.fundacionjala.coding.fernando;

public class NewReleasePrice extends Movie {
    public NewReleasePrice(String title, int priceCode) {
        super(title, priceCode);
    }
    public int getPriceCode() {
        return NEW_RELEASE;
    }

    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
