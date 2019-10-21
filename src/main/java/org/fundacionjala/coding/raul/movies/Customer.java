package org.fundacionjala.coding.raul.movies;

import java.util.LinkedList;

class Customer {
    private String name;
    private LinkedList<Rental> rentals = new LinkedList();

    Customer(final String name) {
        this.name = name;
    }

    public void addRental(final Rental arg) {

        rentals.add(arg);
    }

    public String getName() {

        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        LinkedList<Rental> rentales = this.rentals;
        String result = "Rental Record for " + getName() + "\n";

        while (!rentales.isEmpty()) {
            double thisAmount = 0;
            Rental each = rentales.element();
            //determine amounts for each line
            thisAmount = each.statement(each.getMovie());

            // add bonus for a two day new release rental
            frequentRenterPoints = each.frequentRenterPoints(each.getMovie());

            //show figures for this rental
            result = "\t" + each.getMovie().getTitle() + "\t" + thisAmount + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }
}
