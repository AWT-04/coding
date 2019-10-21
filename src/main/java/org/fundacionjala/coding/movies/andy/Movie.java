package org.fundacionjala.coding.movies.andy;

public  abstract class Movie {
    private String title;
    private int priceCode;
    public Movie(final String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }
    public int getPriceCode() {

        return priceCode;
    }

    public void setPriceCode(int arg) {
        priceCode = arg;
    }
    public String getTitle() {
        return title;
    }

    public abstract double statement(int days);

    public abstract int frequentRenterPoints(int days);
}
