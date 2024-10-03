package BankApplication;

import java.util.HashMap;

public class BankSystem {
    private HashMap<String, BankAccount> accounts = new HashMap<>();

    public void createAccount(String accountNumber, String ownerName) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account number already exists.");
        } else {
            BankAccount newAccount = new BankAccount(accountNumber, ownerName);
            accounts.put(accountNumber, newAccount);
            System.out.println("Account successfully created for " + ownerName);
        }
    }
    public BankAccount getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
    public void showAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (BankAccount account : accounts.values()) {
                System.out.println(account);
            }
        }
    }
}
