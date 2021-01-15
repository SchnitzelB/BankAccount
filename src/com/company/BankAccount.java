package com.company;

public class BankAccount {

    private String accountNumber; //
    private double actionAmount;
    //int actionAmount handles any transaction amount throughout the program.
    private double balance;
    //int balance
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public String accountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this.accountNumber;
    }

    /* The depositIntoBalance() method,
    which acts as a setter, is used to
    deposit funds into the user's account,
    e.g. adding to the int balance.
     */
    public double depositIntoBalance(double actionAmount, double balance) {
        // Makes the instance variable double balance == double balance from the parameter.
        this.balance = balance;
        // Makes the instance variable double actionAmount == double actionAmount from the parameter.
        this.actionAmount = actionAmount;
        // This adds actionAmount to balance
        this.balance += this.actionAmount;
        return this.balance;
    }

    //The getBalance() method is used to return the current balance to the user.
    public double getBalance() {
        return this.balance;
    }

    public double withdrawlFromBalance(double actionAmount, double balance) {
        this.balance = balance;
        this.actionAmount = actionAmount;
        if (this.actionAmount > this.balance) {
            System.out.println("INSUFFICIENT FUNDS ALERT");
            return this.balance;
        } else {
            System.out.println("$" + this.actionAmount + " have been successfully deposited.");
            this.balance -= this.actionAmount;
            return this.balance;
        }
    }

}
