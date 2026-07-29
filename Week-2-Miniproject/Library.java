public class Library
{
    Book[] books = new Book[10];
    int count = 0;

    // Add Book
    void addBook(Book book)
    {
        books[count] = book;
        count++;
        System.out.println(book.getTitle() + " added successfully.");
    }

    // Borrow Book
    void borrowBook(int bookId)
    {
        for(int i = 0; i < count; i++)
        {
            if(books[i].getBookId() == bookId)
            {
                if(books[i].isAvailable())
                {
                    books[i].setAvailable(false);
                    System.out.println("Book borrowed successfully.");
                }
                else
                {
                    System.out.println("Book is already borrowed.");
                }
                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Return Book
    void returnBook(int bookId)
    {
        for(int i = 0; i < count; i++)
        {
            if(books[i].getBookId() == bookId)
            {
                books[i].setAvailable(true);
                System.out.println("Book returned successfully.");
                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Display Books
    void displayBooks()
    {
        System.out.println("\nLibrary Books:");

        for(int i = 0; i < count; i++)
        {
            books[i].displayBook();
            System.out.println();
        }
    }
}