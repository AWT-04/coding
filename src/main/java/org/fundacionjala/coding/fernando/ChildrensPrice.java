package org.fundacionjala.coding.fernando;

public class ChildrensPrice extends Movie {
    private final double childrenPrice = 1.5;
    private final int days = 3;
    public ChildrensPrice(final String title, int priceCode) {
        super(title, priceCode);
    }
    @Override
    public int getPriceCode() {
        return CHILDRENS;
    }
    @Override
    public double getCharge(int daysRented) {
        double result = 0;
        if (daysRented > days) {
            result += (daysRented - days) * childrenPrice;
        }
        return result;
    }
}
