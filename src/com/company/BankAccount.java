package com.company;

public class BankAccount {

    private String accountNumber; //
    //private double actionAmount;
    //int actionAmount handles any transaction amount throughout the program.
    private double balance;
    //int balance
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    // Constructor creation
    // Used to initialized the object being created.
    public BankAccount() {
        this("56789", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    /* Default (Empty) Constructors
    * Default constructors are called only when the parameters, when initializing the object
    * in the main class, are left empty.
    * Default constructors are not necessary, but are always helpful to determine bugs.
    * */

    public BankAccount(String customerName, String customerEmail, String phoneNumber) {
        this("99999",100.55,customerName,customerEmail,phoneNumber);
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Do your initialization in your one main constructor, and the other constructor, will
    // call the main constructor to avoid repetition.
    public BankAccount(String number, double balance, String customerName, String customerEmail,
                       String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public void accountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        System.out.println(accountNumber);
    }

    /* The depositIntoBalance() method,
    which acts as a setter, is used to
    deposit funds into the user's account,
    e.g. adding to the int balance.
     */
    public void depositIntoBalance(double depositAmount) {
        // Makes the instance variable double balance == double balance from the parameter.
        // This adds actionAmount to balance
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New available balance: $" + this.balance);
    }

    //The getBalance() method is used to return the current balance to the user.
    public double getBalance() {
        return this.balance;
    }

    public void withdrawalFromBalance(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("INSUFFICIENT FUNDS ALERT. " +
                    "Available balance: $" + this.balance);
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("$" + withdrawalAmount + " have been successfully withdrawn. Remaining balance: $" + this.balance);
        }
    }

}
