package org.fundacionjala.coding.fernando;

public abstract class Movie {
    private String title;
    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }

    public Movie(final String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
