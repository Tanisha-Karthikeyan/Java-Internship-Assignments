import java.util.Scanner;

public class LibraryManagement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int choice;

        do
        {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Save Books");
            System.out.println("6. Load Books");
            System.out.println("7. Exit");
            System.out.println("Enter your choice:");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter Book ID:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Book Title:");
                    String title = sc.nextLine();

                    System.out.println("Enter Author:");
                    String author = sc.nextLine();

                    Book book = new Book(id, title, author);
                    library.addBook(book);
                    break;

                case 2:
                    library.displayBooks();
                    break;

                case 3:
                    System.out.println("Enter Book ID to borrow:");
                    int borrowId = sc.nextInt();

                    library.borrowBook(borrowId);
                    break;

                case 4:
                    System.out.println("Enter Book ID to return:");
                    int returnId = sc.nextInt();

                    library.returnBook(returnId);
                    break;

                case 5:
                    library.saveBooks();
                    break;

                case 6:
                    library.loadBooks();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}