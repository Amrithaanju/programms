package Test;

import java.util.Scanner;

public class Reverse3 {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a string");
		String s=scan.nextLine();
		System.out.println("original string:"+s);
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
		
			rev=rev+s.charAt(i);
		}
		System.out.println("reverse string:"+rev);
	}

}
