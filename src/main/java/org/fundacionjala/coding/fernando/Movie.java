package org.fundacionjala.coding.fernando;

public abstract class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;

    public abstract double getCharge(int daysRented);

    public abstract int getPriceCode();

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }

    public Movie(final String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public void setPriceCode(int arg) {
        switch (arg) {
            case Movie.REGULAR:
                priceCode = getPriceCode();
                break;
            case Movie.CHILDRENS:
                priceCode = getPriceCode();
                break;
            case Movie.NEW_RELEASE:
                priceCode = getPriceCode();
                break;
            default:
                System.out.println("Please try again");
        }
    }

    public String getTitle() {
        return title;
    }
}
