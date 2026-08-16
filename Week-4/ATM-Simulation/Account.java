import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Account {

    private String accountNumber;
    private int pin;
    private double balance;
    private String transactionFile;

    public Account(String accountNumber, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
        this.transactionFile = "transactions.txt";
    }

    public boolean checkPin(int enteredPin) {
        return pin == enteredPin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }

        balance += amount;

        System.out.println("Amount deposited successfully.");
        System.out.println("New balance: " + balance);

        saveTransaction("Deposited: " + amount);
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }

        balance -= amount;

        System.out.println("Amount withdrawn successfully.");
        System.out.println("Remaining balance: " + balance);

        saveTransaction("Withdrawn: " + amount);
    }

    private void saveTransaction(String transaction) {

        try (PrintWriter writer = new PrintWriter(
                new FileWriter(transactionFile, true))) {

            writer.println(
                    LocalDateTime.now() + " - " + transaction
            );

        } catch (IOException e) {
            System.out.println("Error saving transaction.");
        }
    }
}