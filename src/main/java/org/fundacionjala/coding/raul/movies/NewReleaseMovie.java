package org.fundacionjala.coding.raul.movies;

public class NewReleaseMovie extends Movie {
    public static final int NEW_RELEASE = 1;
    public NewReleaseMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double statement() {
        return 0;
    }
}
