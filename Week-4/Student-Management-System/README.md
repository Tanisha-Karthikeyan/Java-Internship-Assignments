# Student Management System

This is a Java project I made for managing student records using Java, JDBC, and MySQL.

## Features

- Add student
- View students
- Update student details
- Delete student
- Store student data in MySQL

## Technologies Used

- Java
- JDBC
- MySQL
- MySQL Connector/J

## Database

Database name:

`student_management`

Table name:

`students`

The table contains:

- id
- name
- email
- marks

## Project Files

`DatabaseConnection.java`
Connects the Java program to the MySQL database.

`Student.java`
Stores the student details and contains getters and setters.

`StudentDAO.java`
Handles adding, viewing, updating, and deleting student records.

`StudentManagement.java`
Contains the main program and menu.

## OOP Concepts Used

I used:

- Classes and objects
- Constructors
- Encapsulation
- Getters and setters

## JDBC

I used JDBC to connect Java with MySQL.

`PreparedStatement` is used for database operations such as adding, updating, and deleting students.

## Testing

I tested:

- Database connection
- Adding a student
- Viewing students
- Updating a student
- Deleting a student

All the operations worked successfully.

## How to Run

Compile the program:

```text
javac -cp "mysql-connector-j-9.7.0.jar" *.java
```

Run the program:

```text
java -cp ".;mysql-connector-j-9.7.0.jar" StudentManagement
```

The program displays a menu where I can select the required operation.
