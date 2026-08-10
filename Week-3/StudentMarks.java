import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarks
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> marks = new ArrayList<>();

        System.out.println("Enter the number of students:");
        int n = sc.nextInt();

        System.out.println("Enter the marks:");

        for(int i = 0; i < n; i++)
        {
            int mark = sc.nextInt();
            marks.add(mark);
        }

        int highest = marks.get(0);
        int lowest = marks.get(0);

        for(int i = 1; i < marks.size(); i++)
        {
            if(marks.get(i) > highest)
            {
                highest = marks.get(i);
            }

            if(marks.get(i) < lowest)
            {
                lowest = marks.get(i);
            }
        }

        System.out.println("Marks: " + marks);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
}