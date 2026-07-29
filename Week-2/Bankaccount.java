import java.util.Scanner;

public class Bankaccount
{
    String accountHolder;
    double balance;
    Bankaccount(String accountHolder, double balance)
    {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance()
    {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Holder Name:");
        String name = sc.nextLine();

        System.out.println("Enter Initial Balance:");
        double balance = sc.nextDouble();

        Bankaccount account = new Bankaccount(name, balance);

        System.out.println("Enter Deposit Amount:");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.println("Enter Withdraw Amount:");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        account.displayBalance();

        sc.close();
    }
}