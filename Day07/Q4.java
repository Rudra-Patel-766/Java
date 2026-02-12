package Day07;

import java.util.ArrayList;
import java.util.Scanner;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class Account {
    String accountNumber;
    String accountHolderName;
    double balance;

    Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        System.out.println("Deposit successful.");
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful.");
    }

    void transfer(Account targetAccount, double amount) throws InsufficientFundsException {
        if (targetAccount == null) {
            System.out.println("Invalid target account.");
            return;
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for transfer.");
        }
        balance -= amount;
        targetAccount.balance += amount;
        System.out.println("Transfer successful.");
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

class Bank {
    ArrayList<Account> accounts = new ArrayList<>();

    void createAccount(String accNo, String name, double balance) {
        accounts.add(new Account(accNo, name, balance));
    }

    Account getAccount(String accNo) {
        for (Account acc : accounts) {
            if (acc.accountNumber.equals(accNo)) {
                return acc;
            }
        }
        return null;
    }

    void displayAllAccounts() {
        for (Account acc : accounts) {
            acc.displayAccountDetails();
        }
    }
}


public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.print("Enter number of accounts to create: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for account " + i);
            System.out.print("Account number: ");
            String accNo = sc.nextLine();
            System.out.print("Account holder name: ");
            String name = sc.nextLine();
            System.out.print("Initial balance: ");
            double bal = sc.nextDouble();
            sc.nextLine();

            bank.createAccount(accNo, name, bal);
        }

        System.out.print("\nEnter source account number: ");
        String srcNo = sc.nextLine();
        System.out.print("Enter target account number: ");
        String tgtNo = sc.nextLine();

        Account srcAcc = bank.getAccount(srcNo);
        Account tgtAcc = bank.getAccount(tgtNo);

        try {
            System.out.print("\nEnter deposit amount in source account: ");
            double dep = sc.nextDouble();
            srcAcc.deposit(dep);

            System.out.print("Enter withdrawal amount from source account: ");
            double wd = sc.nextDouble();
            srcAcc.withdraw(wd);

            System.out.print("Enter transfer amount: ");
            double tr = sc.nextDouble();
            srcAcc.transfer(tgtAcc, tr);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nAll Account Details:");
        bank.displayAllAccounts();

        sc.close();
    }
}