//Create a program that swaps two numbers without using a third variable
import java.util.*;
public class SwapNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1  = sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2  = sc.nextInt();
		System.out.println("Before swapping");
		System.out.println("Number 1: " + num1 + " Number 2: " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After swapping");
		System.out.println("Number 1: " + num1 + " Number 2: " + num2);
		sc.close();
	}

}
