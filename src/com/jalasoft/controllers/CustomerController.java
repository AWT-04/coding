package com.jalasoft.controllers;

import com.jalasoft.models.Customer;

public class CustomerController extends RentalController{
    Customer customer = new Customer();

    public CustomerController(Customer customer) {
        this.customer = customer;
    }
}
