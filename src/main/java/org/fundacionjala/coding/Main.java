package movies;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Test");
        //customer.addRental(new Rental(new Movie("The Revenant", 1), 2));
        customer.addRental(new Rental(new RegularMovie("Terminator", 1), 5));
        System.out.println(customer.statement());
    }
}
