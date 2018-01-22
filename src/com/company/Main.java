package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        We are going to start working with the idea of Bank Accounts,
//        which plays nicely into the concept of 'Object Orientated Programming".
//        For this application, I want you to build a bank account class that contains different
//        pieces of information. The account should house a "Bank Account Number", "Account Holder Name",
//        and "Balance". All three member fields should be set in the constructor method, using arguments to
//        set the values. Make two methods named "Withdraw" and "Deposit". Withdraw should deduct money from the
//        account, deposit should add money to the account. Both of the methods should accept an argument to altar
//        the account.
//
// From the main application file, create a bank account for everyone in class. Then deposit $57,000 (the average
// starting salary of a developer). Log out the balance of each account.

            BankAccount jakeAccount = new BankAccount("Jake", "1234",0);
            BankAccount zechAccount = new BankAccount("Zech", "5454", 0);
            BankAccount tedAccount = new BankAccount("Ted", "6432", 0);
            BankAccount markAccount = new BankAccount("Mark", "7843", 0);
            BankAccount joanAccount = new BankAccount("Joan", "4545", 0);
            BankAccount kymAccount = new BankAccount("Kym", "8898", 0);
            BankAccount koddieAccount = new BankAccount("Koddie", "3456", 0);
            BankAccount mannyAccount = new BankAccount("Manny", "9876", 0);
            BankAccount loriAccount = new BankAccount("Lori", "4567", 0);
            BankAccount scottAccount = new BankAccount("Scott", "7878", 0);

            jakeAccount.deposit(57000);
            System.out.println("Jake has " + jakeAccount);

            zechAccount.deposit(57000);
            System.out.println("Zech has " + zechAccount);

            tedAccount.deposit(57000);
            System.out.println("Ted has " + tedAccount);

            markAccount.deposit(57000);
            System.out.println("Mark has " + markAccount);

            joanAccount.deposit(57000);
            System.out.println("Joan has " + joanAccount);

            kymAccount.deposit(57000);
            System.out.println("Kym has " + kymAccount);

            koddieAccount.deposit(57000);
            System.out.println("Koddie has " + koddieAccount);

            mannyAccount.deposit(57000);
            System.out.println("Manny has " +mannyAccount);

            loriAccount.deposit(57000);
            System.out.println("Lorri has " + loriAccount);

            scottAccount.deposit(100000);
            System.out.println("Scott has " + scottAccount);





    }
}
