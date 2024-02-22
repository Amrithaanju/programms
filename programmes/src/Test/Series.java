package Test;
import java.util.Scanner;
public class Series {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number:");
		int n=scan.nextInt();
		System.out.print("1+");
		for(int i=2;i<=n;i++) {
			System.out.print("1/"+(i*i));
			if(i<n)
			{
				System.out.print("+");
			}
		}
	}

}
