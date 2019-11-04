package org.fundacionjala.coding.raul.movies;

public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(final Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Rental() {
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }
    public void statement(final Movie movie) {
        movie.statement();
    }
    public void frequentRenterPoints(final Movie movie) {
        movie.getPriceCode();
    }
}
