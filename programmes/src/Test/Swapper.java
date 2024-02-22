package Test;
import java.util.Scanner;
public class Swapper {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 1st number");
		int a=scan.nextInt();
		System.out.println("Please enter 2nd number");
		int b=scan.nextInt();
		System.out.println("Original values:a="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapped values:a="+a+" b="+b);
	}

}
