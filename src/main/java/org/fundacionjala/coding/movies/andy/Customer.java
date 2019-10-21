package org.fundacionjala.coding.movies.andy;

import java.util.ArrayList;


class Customer {
    private String name;
    private ArrayList<Rental> rentals = new ArrayList<>();

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
        int index = 0;
        String result = "Rental Record for " + getName() + "\n";
        StringBuilder bld = new StringBuilder();
        int ind = rentals.size();
        while (index < ind) {
            double thisAmount;
            Rental each = rentals.get(index);
            //determine amounts for each line
            thisAmount = each.statement(each.getMovie());
            // add bonus for a two day new release rental
            frequentRenterPoints += each.frequentRenterPoints(each.getMovie());
            //show figures for this rental
            bld.append("\t").append(each.getMovie().getTitle()).append("\t").append(thisAmount).append("\n");
            totalAmount += thisAmount;
            index++;
        }
        //add footer lines
        result += bld.toString();
        result += "Amount owed is " + totalAmount
                + "\n";
        result += "You earned " + frequentRenterPoints
                + " frequent renter points";
        return result;
    }
}
