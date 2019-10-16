package org.fundacionjala.coding.Raul.movies;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new RegularMovie("The Revenant", 1), 2));
        customer.addRental(new Rental(new ChildrenMovie("Terminator", 0), 2));
        System.out.println(customer.statement());
    }
}
