package com;

class Customer {
    private String name;
    private String customerId;

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }
}

class BankAccount {
    private Customer customer;
    private String accountNumber;
    private double balance;

    public BankAccount(Customer customer, String accountNumber) {
        this.customer = customer;
        this.accountNumber = accountNumber;
        this.balance = 10000;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
            System.out.println("====================================");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
           
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void transfer(BankAccount toAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            toAccount.deposit(amount);
            System.out.println("Transferred " + amount + " to account " + toAccount.getAccountNumber());
            System.out.println("==================================");
        } else {
            System.out.println("Transfer failed due to insufficient balance or invalid amount.");
        }
    }
}

public class BankingApp {
    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer("Alice", "C001");
        Customer customer2 = new Customer("Bob", "C002");

        // Create bank accounts
        BankAccount account1 = new BankAccount(customer1, "A001");
        BankAccount account2 = new BankAccount(customer2, "A002");

        // Perform banking operations
        account1.deposit(500);
        account2.withdraw(100);
        account1.transfer(account2, 200);

        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());
    }
}
