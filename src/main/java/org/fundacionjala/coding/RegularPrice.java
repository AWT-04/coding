package movies;

public class RegularPrice extends Movie {
    public RegularPrice(String title, int priceCode) {
        super(title, priceCode);
    }

    public int getPriceCode() {
        return Movie.REGULAR;
    }

    public double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;
        return result;
    }
}
