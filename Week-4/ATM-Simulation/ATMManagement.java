import java.util.Scanner;

public class ATMManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Account account = new Account("ACC1001", 1234, 5000.00);
        ATM atm = new ATM(account);

        System.out.println("===== Welcome to ATM =====");

        int attempts = 0;
        boolean loggedIn = false;

        while (attempts < 3) {

            System.out.print("Enter your PIN: ");
            int pin = scanner.nextInt();

            if (atm.login(pin)) {
                loggedIn = true;
                System.out.println("PIN verified successfully.");
                break;
            }

            attempts++;
            System.out.println("Incorrect PIN.");

            if (attempts < 3) {
                System.out.println("Attempts remaining: " + (3 - attempts));
            }
        }

        if (!loggedIn) {
            System.out.println("Too many incorrect attempts.");
            System.out.println("Account locked.");
            scanner.close();
            return;
        }

        int choice;

        do {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    atm.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();

                    atm.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();

                    atm.withdraw(withdrawAmount);
                    break;

                case 4:
                    atm.showTransactionHistory();
                    break;

                case 5:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        scanner.close();
    }
}