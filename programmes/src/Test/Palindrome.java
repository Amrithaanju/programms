package Test;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[]args)
	{
		//number input
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int k=num;//Safely keeping the original number
		int rev=0;
		//reversing the number
		while(num>0)
		{
			int rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		System.out.println("Original number="+k);
		System.out.println("Reverse="+rev);
		if(k==rev)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not a Palindrome");
	}

}

}
