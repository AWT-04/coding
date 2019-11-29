package org.fundacionjala.coding.movies.andy;

class Rental {
    private Movie movie;
    private int daysRented;

    Rental(final Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }
    public double statement(final Movie movie) {
        return movie.statement(getDaysRented());
    }
    public int frequentRenterPoints(final Movie movie) {
        return movie.frequentRenterPoints(getDaysRented());
    }
}
