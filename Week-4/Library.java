import java.io.*;
import java.util.ArrayList;

public class Library
{
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book)
    {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void displayBooks()
    {
        if (books.isEmpty())
        {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books)
        {
            book.displayBook();
            System.out.println("--------------------");
        }
    }

    public void borrowBook(int id)
    {
        for (Book book : books)
        {
            if (book.getId() == id)
            {
                if (book.isBorrowed())
                {
                    System.out.println("Book is already borrowed.");
                }
                else
                {
                    book.borrowBook();
                    System.out.println("Book borrowed successfully.");
                }
                return;
            }
        }

        System.out.println("Book not found.");
    }

    public void returnBook(int id)
    {
        for (Book book : books)
        {
            if (book.getId() == id)
            {
                if (!book.isBorrowed())
                {
                    System.out.println("Book is already available.");
                }
                else
                {
                    book.returnBook();
                    System.out.println("Book returned successfully.");
                }
                return;
            }
        }

        System.out.println("Book not found.");
    }

    public void saveBooks()
    {
        try
        {
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter("books.txt"));

            for (Book book : books)
            {
                writer.write(
                        book.getId() + "," +
                        book.getTitle() + "," +
                        book.getAuthor() + "," +
                        book.isBorrowed()
                );

                writer.newLine();
            }

            writer.close();

            System.out.println("Books saved successfully.");
        }
        catch (IOException e)
        {
            System.out.println("Error while saving books.");
        }
    }

    public void loadBooks()
    {
        try
        {
            BufferedReader reader =
                    new BufferedReader(new FileReader("books.txt"));

            String line;

            while ((line = reader.readLine()) != null)
            {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String title = data[1];
                String author = data[2];
                boolean borrowed = Boolean.parseBoolean(data[3]);

                Book book = new Book(id, title, author);

                if (borrowed)
                {
                    book.borrowBook();
                }

                books.add(book);
            }

            reader.close();

            System.out.println("Books loaded successfully.");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("No books file found.");
        }
        catch (IOException e)
        {
            System.out.println("Error while loading books.");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid data in books file.");
        }
    }
}