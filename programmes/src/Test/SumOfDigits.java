package Test;
import java.util.Scanner;
public class SumOfDigits {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int n=scan.nextInt();
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			n=n/10;
			sum=sum+rem;
		}
		System.out.println("Sum of the digits="+sum);
	}

}
