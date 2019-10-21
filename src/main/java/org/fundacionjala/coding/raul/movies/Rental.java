package org.fundacionjala.coding.raul.movies;

import java.util.logging.Logger;

class Rental {
    private Movie movie;
    private int daysRented;
    private static final double INCREMENT = 1.5;
    private static final int THREE = 3;


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
        double thisAmount = movie.statement();
        switch (movie.getPriceCode()) {
            case 0:
                thisAmount += 2;
                if (getDaysRented() > 2) {
                    thisAmount += (getDaysRented() - 2) * INCREMENT;
                }
                break;
            case 1:
                thisAmount += getDaysRented() * THREE;
                break;
            case 2:
                if (getDaysRented() > THREE) {
                    thisAmount += (getDaysRented() - THREE) * INCREMENT;
                }
                break;
            default:
                Logger.getLogger("the price code selected is not present in the system");
                break;
        }
        return thisAmount;
    }
    public int frequentRenterPoints(final Movie movie) {
        int frequentRenterPoints = 0;
        switch (movie.getPriceCode()) {
            case 0:
                // add frequent renter points
                frequentRenterPoints++;
                break;
            case 1:
                // add frequent renter points
                frequentRenterPoints++;
                break;
            case 2:
                // add frequent renter points
                frequentRenterPoints++;

                // add bonus for a two day new release rental
                if (getDaysRented() > 1) {
                    frequentRenterPoints++;
                }
                break;
            default:
                Logger.getLogger("the price code selected is not present in the system");
                break;
        }
        return frequentRenterPoints;
    }
}
