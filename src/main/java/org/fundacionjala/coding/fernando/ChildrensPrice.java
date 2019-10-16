package org.fundacionjala.coding.fernando;

public class ChildrensPrice extends Movie {
    public ChildrensPrice(String title, int priceCode) {
        super(title, priceCode);
    }

    public int getPriceCode() {
        return CHILDRENS;
    }

    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3) {
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }
}
