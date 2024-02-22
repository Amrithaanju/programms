package Test;

import java.util.Scanner;

public class RecursionFactorial {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=scan.nextInt();
		System.out.println("Factorial="+findFactorial(num));

}
	public static int findFactorial(int num) {
		//base condition
		if(num==1)
		{
			return 1;
		}
		//recursive call
		return num * findFactorial(num-1);
	}
}
