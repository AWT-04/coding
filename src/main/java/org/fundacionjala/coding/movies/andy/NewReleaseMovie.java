package org.fundacionjala.coding.movies.andy;

public class NewReleaseMovie extends Movie {
    public static final double NEW_RELEASE = 3;
    public NewReleaseMovie(final String title, int priceCode) {

        super(title, priceCode);
    }

    @Override
    public double statement(int days) {
        double thisAmount = 0;
        thisAmount += days * NEW_RELEASE;
        return thisAmount;
    }

    @Override
    public int frequentRenterPoints(int days) {
        int frequentRenterPoints = 0;
        frequentRenterPoints = frequentRenterPoints + 1;
        return frequentRenterPoints;
    }
}
