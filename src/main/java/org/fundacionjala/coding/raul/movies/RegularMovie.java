package org.fundacionjala.coding.raul.movies;

public class RegularMovie extends Movie {
    private static final double INCREMENT = 1.5;
    public RegularMovie(final String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double statement() {
        double thisAmount = 0;
        thisAmount += INCREMENT;
        return thisAmount;
    }
}
