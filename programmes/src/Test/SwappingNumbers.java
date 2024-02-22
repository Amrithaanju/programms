package Test;
import java.util.Scanner;
public class SwappingNumbers {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		System.out.println("Reverse="+rev);
	}

}
