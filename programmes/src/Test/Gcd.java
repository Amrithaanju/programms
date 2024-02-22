package Test;
import java.util.Scanner;
public class Gcd {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=scan.nextInt();
		System.out.println("Enter 2nd number");
		int b=scan.nextInt();
		//if(b%a==0)
		//{SOP(gcd=+a)}
		while(true)
		{
			if(b%a==0)
			{
				System.out.println("GCD="+a);
				break;
			}
			int temp=b;
			b=a;
			a=temp%a;
		}
	}
}
