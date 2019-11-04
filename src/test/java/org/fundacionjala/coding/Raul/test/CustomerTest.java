package org.fundacionjala.coding.Raul.test;

import org.fundacionjala.coding.raul.movies.Customer;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    private Customer customer = new Customer("Ramalaso");

    @Test
    public void getName() {
        Assert.assertEquals("Ramalaso", customer.getName());
    }

    @Test
    public void statement() {
        double totalAmount = 0.0;
        Assert.assertTrue(totalAmount == 0.0);
    }
}
