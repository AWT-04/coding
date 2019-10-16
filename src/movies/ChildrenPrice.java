package movies;

public class ChildrenPrice extends Price {

    public ChildrenPrice(double amount, int days) {
        super(amount, days);
    }

    @Override
    public double calculate(double amount, int days) {
        amount += 1.5;
        if (days > 3)
            amount += (days - 3) * 1.5;
        return amount;
    }
}
