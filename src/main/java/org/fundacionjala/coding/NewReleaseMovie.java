package movies;

public class NewReleaseMovie extends Movie {
    public static final int NEW_RELEASE = 1;
    public NewReleaseMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double statement() {
        double thisAmount = 0;
        return thisAmount;
    }
}
