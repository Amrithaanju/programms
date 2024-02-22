package Test;

import java.util.Scanner;

public class RecursionTable {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=scan.nextInt();
		printTable(num,1);
		
	}
	public static void printTable(int num,int times)
	{
		if(times==11)
		{
			return;
		}
		System.out.println(num + " x " +times + " = " + num * times);
		printTable(num,times+1);
	}

}
