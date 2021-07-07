package org.fundacionjala.coding.raul.movies;

public class ChildrenMovie extends Movie {
    public static final double INCREMENT = 1.5;
    public static final int CHILDRENS = 2;
    public ChildrenMovie(final String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double statement() {
        double thisAmount = 0;
        thisAmount += INCREMENT;
        return thisAmount;
    }
}
