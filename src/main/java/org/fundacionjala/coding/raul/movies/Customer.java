package org.fundacionjala.coding.raul.movies;

import java.util.LinkedList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals;

    public Customer(String name, List<Rental> rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    public Customer(final String name) {
        this.name = name;
    }

    public void addRental(final Rental rental) {

        rentals.add(rental);
    }

    public String getName() {

        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        LinkedList<Rental> rentales = (LinkedList<Rental>) this.rentals;
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for " + getName() + "\n");

        while (!rentales.isEmpty()) {
            double thisAmount = 0;
            Rental each = rentales.element();
            //determine amounts for each line
            each.statement(each.getMovie());

            // add bonus for a two day new release rental
            each.frequentRenterPoints(each.getMovie());

            //show figures for this rental
            result.append("\t" + each.getMovie().getTitle() + "\t" + thisAmount + "\n");
            totalAmount += thisAmount;
        }
        //add footer lines
        result.append("Amount owed is " + totalAmount + "\n");
        result.append("You earned " + frequentRenterPoints + " frequent renter points");
        return result.toString();
    }
}
