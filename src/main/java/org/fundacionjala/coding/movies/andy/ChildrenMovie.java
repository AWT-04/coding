package org.fundacionjala.coding.movies.andy;

public class ChildrenMovie extends Movie {
    public static final double CHILDRENS = 1.5;
    public static final int DAYS_ESP = 3;
    public ChildrenMovie(final String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double statement(int days) {
        double thisAmount = 0;
        thisAmount += CHILDRENS;
        if (days > DAYS_ESP) {
            thisAmount += (days - DAYS_ESP) * CHILDRENS;
        }
        return thisAmount;
    }

    @Override
    public int frequentRenterPoints(int days) {
        int frequentRenterPoints = 0;
        frequentRenterPoints++;
        // add bonus for a two day new release rental
        if (days > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }
}
