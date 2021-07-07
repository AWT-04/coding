package org.fundacionjala.coding.raul.movies;

public abstract class Movie {
    private String title;
    private int priceCode;

    public Movie(final String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public String getTitle() {
        return title;
    }

    public abstract double statement();
}
