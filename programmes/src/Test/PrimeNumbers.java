package Test;
import java.util.Scanner;
public class PrimeNumbers {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=scan.nextInt();
		int fact=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				fact++;
			}
		}
		if(fact==2)
		{
			System.out.println("Given number is prime");
		}
		else
		{
			System.out.println("Given number is composite");
		}
	}

}
