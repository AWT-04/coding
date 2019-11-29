package org.fundacionjala.coding.movies.andy;

public class RegularMovie extends Movie {
    public static final double REGULAR = 1.5;
    public RegularMovie(final String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double statement(int days) {
        double thisAmount = 0;
        thisAmount = thisAmount + REGULAR;
        thisAmount += 2;
        if (days > 2) {
            thisAmount += (days - 2) * REGULAR;
        }
        return thisAmount;
    }

    @Override
    public int frequentRenterPoints(int days) {
        int frequentRenterPoints = 0;
        frequentRenterPoints = frequentRenterPoints + 1;
        return frequentRenterPoints;
    }
}
