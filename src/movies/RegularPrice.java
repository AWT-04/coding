package movies;

public class RegularPrice extends Price {

    public RegularPrice(double amount, int days) {
        super(amount, days);
    }

    @Override
    public double calculate(double amount, int days) {
        amount += 2;
        if (days > 2)
            amount += (days - 2) * 1.5;
        return amount;
    }
}
