//Print a multiplication table of any number using loop
import java.util.*;
public class MultiplicationTable 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you want to print multiplication tables");
		int n = sc.nextInt();
		System.out.println(n + " TABLES:");
		for(int i = 1;i<=10;i++)
		{
			System.out.println(n + " x\t" + i + "\t= " + (n*i));
		}
		sc.close();
	}

}
