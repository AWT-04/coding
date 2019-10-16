package org.fundacionjala.coding.fernando;

import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private String name;
    private Vector rentals = new Vector();

    Customer(final String name) {
        this.name = name;
    }

    public void addRental(final Rental arg) {
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public double amountFor(final Rental rental) {
        return rental.getCharge();
    }

    public String statement() {
        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {

            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t"
                    + String.valueOf(each.getCharge()) + "\n";
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge())
                + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints())
                + " frequent renter points";
        return result;
    }

    public double getTotalCharge() {
        double result = 0;
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    public double getTotalFrequentRenterPoints() {
        double result = 0;
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

}
