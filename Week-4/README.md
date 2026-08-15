Week 4 Java Internship Assignments
Project Title

Library Management System

Objective

The Library Management System manages books in a library. It allows users to add books, display books, borrow books, return books, save book information to a text file, and load book information from a text file.

Classes Used
Book

The Book class stores:

Book ID
Book title
Author
Borrowed status
Library

The Library class manages the collection of books. It provides methods to:

Add a book
Display books
Borrow a book
Return a book
Save books to a file
Load books from a file
LibraryManagement

The LibraryManagement class contains the main() method. It provides a menu through which the user interacts with the library system.

OOP Concepts

The project demonstrates:

Encapsulation through private fields and getter methods.
Classes and objects through Book and Library.
Methods for managing book operations.
Collections

An ArrayList<Book> stores the books in the library.

File Handling

The project uses:

FileWriter
FileReader
BufferedWriter
BufferedReader

Book information is stored in books.txt.

Exception Handling

The program handles:

FileNotFoundException
IOException
NumberFormatException
Program Flow
Start the application.
Display the library menu.
Add or view books.
Borrow or return books.
Save book information to books.txt.
Load saved book information.
Exit the application.
Conclusion

The Library Management System demonstrates Java OOP, collections, file handling, and exception handling through a simple menu-driven application.
