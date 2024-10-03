package BankApplication;

import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        BankSystem bankSystem = new BankSystem();
        Scanner scanner = new Scanner(System.in);
        String accountNumber, ownerName;
        double amount;

        while (true) {
            System.out.println("\n---Bank Menu---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Transfer Money");
            System.out.println("6. Show All Accounts");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter Account number: ");
                    accountNumber = scanner.next();
                    System.out.println("Enter owner name: ");
                    ownerName = scanner.next();
                    bankSystem.createAccount(accountNumber, ownerName);
                    break;
                case 2:
                    System.out.println("Enter account number: ");
                    accountNumber = scanner.next();
                    BankAccount account = bankSystem.getAccount(accountNumber);
                    if (account != null) {
                        System.out.print("Enter amount to deposit: ");
                        amount = scanner.nextDouble();
                        account.deposit(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    account = bankSystem.getAccount(accountNumber);
                    if (account != null) {
                        System.out.print("Enter amount to withdraw: ");
                        amount = scanner.nextDouble();
                        account.withdraw(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    account = bankSystem.getAccount(accountNumber);
                    if (account != null) {
                        System.out.println("Your balance: $" + account.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter your account number: ");
                    accountNumber = scanner.next();
                    account = bankSystem.getAccount(accountNumber);
                    if (account != null) {
                        System.out.print("Enter receiver's account number: ");
                        String receiverAccountNumber = scanner.next();
                        BankAccount receiverAccount = bankSystem.getAccount(receiverAccountNumber);
                        if (receiverAccount != null) {
                            System.out.print("Enter amount to transfer: ");
                            amount = scanner.nextDouble();
                            account.transfer(receiverAccount, amount);
                        } else {
                            System.out.println("Receiver's account not found.");
                        }
                    } else {
                        System.out.println("Your account not found.");
                    }
                    break;
                case 6:
                    bankSystem.showAccounts();
                    break;
                case 0:
                    System.out.println("Exiting...");
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
