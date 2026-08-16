# ATM Simulation Project

This is a simple ATM simulation program I made using Java.

## Features

- PIN login
- Check balance
- Deposit money
- Withdraw money
- View transaction history

## Technologies Used

- Java
- OOP
- File handling

## Files

Account.java

This file stores the account details, PIN, and balance. It also contains the deposit and withdrawal methods.

ATM.java

This file handles the ATM operations and displays the transaction history.

ATMManagement.java

This is the main file. It contains the menu and takes input from the user.

transactions.txt

This file stores the transaction history.

## OOP Used

I used classes, objects, constructors, private variables, and methods in this project.

## File Handling

I used FileWriter to save deposit and withdrawal transactions into transactions.txt.

I used BufferedReader to read and display the transaction history.

## Testing

I tested:

- PIN login
- Check balance
- Deposit
- Withdraw
- Transaction history
- Exit

All the required features worked successfully.

## How to Run

Compile the files:

```text
javac *.java
```

Run the program:

```text
java ATMManagement
```

Test PIN:

```text
1234
```
