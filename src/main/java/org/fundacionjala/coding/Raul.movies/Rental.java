package org.fundacionjala.coding.Raul.movies;

class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }
    public double statement(Movie movie){
        double thisAmount = movie.statement();
        switch (movie.getPriceCode()){
            case 0:
                thisAmount += 2;
                if (getDaysRented() > 2)
                    thisAmount += (getDaysRented() - 2) * 1.5;
                break;
            case 1:
                thisAmount += getDaysRented() * 3;
                break;
            case 2:
                if (getDaysRented() > 3)
                    thisAmount += (getDaysRented() - 3) * 1.5;
                break;
            default:
                System.out.println("the price code selected is not present in the system");
                break;
        }
        return thisAmount;
    }
    public int frequentRenterPoints(Movie movie){
        int frequentRenterPoints = 0;
        switch (movie.getPriceCode()){
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
                if (getDaysRented() > 1)
                    frequentRenterPoints++;
                break;
            default:
                System.out.println("the price code selected is not present in the system");
                break;
        }
        return frequentRenterPoints;
    }
}