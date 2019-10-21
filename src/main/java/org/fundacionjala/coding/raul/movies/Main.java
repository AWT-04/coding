package org.fundacionjala.coding.raul.movies;

public class Main {
    public static void main(final String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new RegularMovie("The Revenant", 1), 2));
        customer.addRental(new Rental(new ChildrenMovie("Terminator", 0), 2));
    }
}
