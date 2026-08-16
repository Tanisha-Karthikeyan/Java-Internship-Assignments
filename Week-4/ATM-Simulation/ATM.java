import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ATM {

    private Account account;

    public ATM(Account account) {
        this.account = account;
    }

    public boolean login(int enteredPin) {
        return account.checkPin(enteredPin);
    }

    public void checkBalance() {
        System.out.println("Current balance: " + account.getBalance());
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public void showTransactionHistory() {

        System.out.println("\n===== Transaction History =====");

        try (BufferedReader reader =
                     new BufferedReader(new FileReader("transactions.txt"))) {

            String line;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                found = true;
            }

            if (!found) {
                System.out.println("No transactions found.");
            }

        } catch (IOException e) {
            System.out.println("No transaction history found.");
        }
    }
}