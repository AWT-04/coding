package org.fundacionjala.coding.Raul.movies;

public class ChildrenMovie extends Movie {
    public static final int CHILDRENS = 2;
    public ChildrenMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double statement() {
        double thisAmount = 0;
        thisAmount += 1.5;
        return thisAmount;
    }
}
