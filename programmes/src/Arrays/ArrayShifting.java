package Arrays;

import java.util.Scanner;

public class ArrayShifting {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the size of array");
		int size=scan.nextInt();
		//input creation
		int[] a=new int[size];
		arr[i]=scan.nextInt();
		//array input
		{
		System.out.println("Please enter the element for array a index"+i)
		arr[i]=scan.nextInt();
		}
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>=1;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		System.out.println("Rotate array");
		for(int i=0;i<a-lengt;i++)
		{
			System.out.println(a[i]+"");
		}
	}

}
