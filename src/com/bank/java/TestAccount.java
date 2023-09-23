package com.bank.java;

public class TestAccount {
    public static void main(String[] args) {

        Account currentAccount = new Account();
        Account savingsAccount = new Account();
        Account investmentAccount = new Account();

        currentAccount.number = 01;
        currentAccount.balance = 27.1;
        currentAccount.client.name = "Antonio";
        currentAccount.client.age = 22;

        savingsAccount.number = 11;
        savingsAccount.balance = 550.8;
        savingsAccount.client.name = "Davi";
        savingsAccount.client.age = 18;

        investmentAccount.number = 21;
        investmentAccount.balance = 1895.4;
        investmentAccount.client.name = "Priscilla";
        investmentAccount.client.age = 40;

        System.out.println("Account num: " + currentAccount.number);
        System.out.println("Current Balance: " + currentAccount.balance);
        System.out.println("Client: " + currentAccount.client.name);
        System.out.println("Age: " + currentAccount.client.age);
    }
}
