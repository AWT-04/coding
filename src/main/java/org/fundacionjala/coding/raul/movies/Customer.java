package org.fundacionjala.coding.raul.movies;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {

        rentals.add(arg);
    }

    public String getName() {

        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            //determine amounts for each line
            thisAmount = each.statement(each.getMovie());

            // add bonus for a two day new release rental
            frequentRenterPoints = each.frequentRenterPoints(each.getMovie());

            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    thisAmount + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + totalAmount +
                "\n";
        result += "You earned " + frequentRenterPoints
                +
                " frequent renter points";
        return result;
    }
}
