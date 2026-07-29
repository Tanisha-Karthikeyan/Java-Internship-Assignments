public class User
{
    protected String name;

    User(String name)
    {
        this.name = name;
    }

    public void displayUser()
    {
        System.out.println("User : " + name);
    }
}