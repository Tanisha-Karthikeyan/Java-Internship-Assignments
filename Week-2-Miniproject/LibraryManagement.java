public class LibraryManagement
{
    public static void main(String[] args)
    {
        Library library = new Library();
        Book b1 = new Book(101, "Java Programming", "James Gosling");
        Book b2 = new Book(102, "Data Structures", "Mark Allen");
        library.addBook(b1);
        library.addBook(b2);
        System.out.println("\nAvailable Books:");
        library.displayBooks();
        System.out.println("\nBorrowing Book ID 101...");
        library.borrowBook(101);
        library.displayBooks();
        System.out.println("\nReturning Book ID 101...");
        library.returnBook(101);
        library.displayBooks();
    }
}