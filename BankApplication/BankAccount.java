package BankApplication;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Successfully withdrew " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public void transfer(BankAccount receiver, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            receiver.deposit(amount);
            System.out.println("Successfully transferred " + amount + " to " + receiver.getOwnerName());
        } else {
            System.out.println("Transfer failed. Insufficient balance or invalid amount.");
        }
    }
    @Override
    public String toString(){
        return "Account No: " + accountNumber + ", Owner: " + ownerName + ", Balance: " + balance;
    }
}
