package org.fundacionjala.coding.fernando;

import java.util.ArrayList;
import java.util.Iterator;


class Customer {
    private String name;
    private ArrayList rentals = new ArrayList();

    Customer(final String name) {
        this.name = name;
    }

    public void addRental(final Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public double amountFor(final Rental rental) {
        return rental.getCharge();
    }

    public String statement() {
        Iterator iterator = this.rentals.iterator();
        String result = "Rental Record for " + getName() + "\n";
        while (iterator.hasNext()) {

            Rental each = (Rental) iterator.next();
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t"
                    + each.getCharge() + "\n";
        }
        //add footer lines
        result += "Amount owed is " + getTotalCharge()
                + "\n";
        result += "You earned " + getTotalFrequentRenterPoints()
                + " frequent renter points";
        return result;
    }

    public double getTotalCharge() {
        double result = 0;
        Iterator iterator = this.rentals.iterator();
        while (iterator.hasNext()) {
            Rental each = (Rental) iterator.next();
            result += each.getCharge();
        }
        return result;
    }

    public double getTotalFrequentRenterPoints() {
        double resultPoints = 0;
        Iterator iterator = this.rentals.iterator();
        while (iterator.hasNext()) {
            Rental each = (Rental) iterator.next();
            resultPoints += each.getFrequentRenterPoints();
        }
        return resultPoints;
    }

}
