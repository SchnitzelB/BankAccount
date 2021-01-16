package com.company;

public class VipCustomer {

    private double creditLimit;
    private String customerName;
    private String customerEmail;

    public VipCustomer() {
        this(50000.00, "Default Name", "default@email.com");
    }
    // Empty constructor. ONLY USED FOR DEFAULT VALUES!!!

    public VipCustomer(double creditLimit, String customerName) {
        this(creditLimit, customerName, "unknown@email.com");
    }
    //THIS CONSTRUCTOR CALLS ON THE OTHER CONSTRUCTOR TO AVOID SAVING OVER THE INSTANCES.

    public VipCustomer(double creditLimit, String customerName, String customerEmail) {
        this.creditLimit = creditLimit;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
    }
    //THIS CONSTRUCTOR INITIALIZES ALL INSTANCE VALUES!!!

    public double getCreditLimit() {
        return creditLimit;
    }
    // THIS GETTER RETURNS THE CREDIT LIMIT!!!

    public String getCustomerName() {
        return customerName;
    }
    //THIS GETTER RETURNS THE CUSTOMER NAME!!!


    public String getCustomerEmail() {
        return customerEmail;
    }
}
