//Write a Java program to create a class called "Bank" with a collection of accounts and methods to 
//add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.

package com.assignments;

import java.util.Scanner;

// Account class to store account details
class Account {
    long accountNumber;
    String accountHolderName;
    double balance;

    public Account(long accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

// Bank class to manage the array of accounts
class Bank {
    private Account[] accounts;
    private int accountCount;

    public Bank(int capacity) {
        accounts = new Account[capacity];
        accountCount = 0;
    }

    // Method to add a new account
    public void addAccount(long accountNumber, String accountHolderName, double initialBalance) {
        if (accountCount < accounts.length) {
            accounts[accountCount++] = new Account(accountNumber, accountHolderName, initialBalance);
            System.out.println("Account added successfully!");
        } else {
            System.out.println("Cannot add more accounts. Bank is full.");
        }
    }

    // Method to remove an account
    public void removeAccount(long accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].accountNumber == accountNumber) {
                // Shift the remaining accounts to remove the account
                for (int j = i; j < accountCount - 1; j++) {
                    accounts[j] = accounts[j + 1];
                }
                accounts[--accountCount] = null;  // Clear the last account slot
                System.out.println("Account removed successfully.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    // Method to deposit money into an account
    public void deposit(long accountNumber, double amount) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].accountNumber == accountNumber) {
                accounts[i].deposit(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    // Method to withdraw money from an account
    public void withdraw(long accountNumber, double amount) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].accountNumber == accountNumber) {
                accounts[i].withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    // Method to view account details
    public void viewAccountDetails(long accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].accountNumber == accountNumber) {
                accounts[i].displayAccountDetails();
                return;
            }
        }
        System.out.println("Account not found.");
    }
}

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank(5);  // Capacity of the bank to hold 5 accounts
        int choice;

        do {
            System.out.println("\nBank Menu:");
            System.out.println("1. Add Account");
            System.out.println("2. Remove Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. View Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    long accNumber = scanner.nextLong();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter account holder name: ");
                    String accHolderName = scanner.nextLine();
                    System.out.print("Enter initial deposit amount: ");
                    double initialDeposit = scanner.nextDouble();
                    bank.addAccount(accNumber, accHolderName, initialDeposit);
                    break;

                case 2:
                    System.out.print("Enter account number to remove: ");
                    long removeAccNumber = scanner.nextLong();
                    bank.removeAccount(removeAccNumber);
                    break;

                case 3:
                    System.out.print("Enter account number for deposit: ");
                    long depositAccNumber = scanner.nextLong();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(depositAccNumber, depositAmount);
                    break;

                case 4:
                    System.out.print("Enter account number for withdrawal: ");
                    long withdrawAccNumber = scanner.nextLong();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(withdrawAccNumber, withdrawAmount);
                    break;

                case 5:
                    System.out.print("Enter account number to view details: ");
                    long viewAccNumber = scanner.nextLong();
                    bank.viewAccountDetails(viewAccNumber);
                    break;

                case 6:
                    System.out.println("Exiting... ThankYou!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
