package Test;
import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		int a=0;int b=1;int sum=0;
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			sum=a+b;
			a=b;
			b=sum;
		}
	}
}


