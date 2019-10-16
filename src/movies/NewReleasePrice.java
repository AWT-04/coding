package movies;

public class NewReleasePrice extends Price {

    public NewReleasePrice(double amount, int days) {
        super(amount, days);
    }

    @Override
    public double calculate(double amount, int days) {
        amount += days * 3;
        return amount;
    }
}