public class StudentUser extends User
{
    StudentUser(String name)
    {
        super(name);
    }

    void borrowBook()
    {
        System.out.println(name + " borrowed a book.");
    }
}