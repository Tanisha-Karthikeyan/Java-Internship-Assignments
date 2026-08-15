import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter number of values:");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter number:");
            int number = sc.nextInt();

            numbers.add(number);
        }

        System.out.println("\nOriginal List:");
        System.out.println(numbers);

        Collections.sort(numbers);

        System.out.println("\nSorted List:");
        System.out.println(numbers);

        sc.close();
    }
}