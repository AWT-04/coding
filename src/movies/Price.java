package movies;

public  abstract class Price {
    double amount;
    int days;
    public Price(double amount, int days) {
        this.amount=amount;
        this.days=days;
    }

    public  abstract double  calculate(double amount, int days);
}
