package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.depositIntoBalance(200,5000);

        System.out.println("Available funds: $" + bankAccount.getBalance());

        bankAccount.withdrawlFromBalance(1400,5000);
        System.out.println("Available funds: $" + bankAccount.getBalance());

        bankAccount.withdrawlFromBalance(5400,5000);
        System.out.println("Available funds: $" + bankAccount.getBalance());
    }
}
