package movies;

public class RegularMovie extends Movie {
    public static final int REGULAR = 0;
    public RegularMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double statement() {
        double thisAmount = 0;
        thisAmount+= 1.5;
        return thisAmount;
    }
}
