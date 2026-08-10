import java.util.Scanner;

public class MultipleCatch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("Enter a number:");
            int num = sc.nextInt();

            System.out.println("Enter another number:");
            int divisor = sc.nextInt();

            int result = num / divisor;

            int[] numbers = {10, 20, 30};
            System.out.println("Array element: " + numbers[5]);

            System.out.println("Result = " + result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero.");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of range.");
        }
        catch(Exception e)
        {
            System.out.println("Some other error occurred.");
        }

        sc.close();
    }
}