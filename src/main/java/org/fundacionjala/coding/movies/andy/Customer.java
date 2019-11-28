package org.fundacionjala.coding.movies.andy;

import java.util.ArrayList;


class Customer {
    private String name;
    private ArrayList<Rental> rentals;
    private Rental each;

    Customer(final String name) {
        this.name = name;
        this.rentals = new ArrayList<>();
    }

    public void addRental(final Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return this.name;
    }

    public double amount(int i) {
        each = rentals.get(i);
        return each.statement(each.getMovie());
    }

    public int referencePoints(int i) {
        each = rentals.get(i);
        return each.frequentRenterPoints(each.getMovie());
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        StringBuilder bld = new StringBuilder();
        bld.append("Rental Record for ").append(getName()).append("\n");
        for (int index = 0; index < rentals.size(); index++) {
            double thisAmount;
            thisAmount = amount(index);
            frequentRenterPoints += referencePoints(index);
            //show figures for this rental
            bld.append("\t").append(each.getMovie().getTitle()).append("\t").append(thisAmount).append("\n");
            totalAmount += thisAmount;
        }
        //add footer lines
        bld.append("Amount owed is ").append(totalAmount).append("\n");
        bld.append("You earned ").append(frequentRenterPoints).append(" frequent renter points");
        return bld.toString();
    }
}
