import java.util.HashMap;
import java.util.Scanner;

public class StudentMap
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> students = new HashMap<>();

        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter roll number:");
            int rollNumber = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter student name:");
            String name = sc.nextLine();

            students.put(rollNumber, name);
        }

        System.out.println("\nStudent Details:");

        for(Integer rollNumber : students.keySet())
        {
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + students.get(rollNumber));
        }

        sc.close();
    }
}