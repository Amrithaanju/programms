package Arrays;

import java.util.Scanner;

public class ArrayAddition {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the array size");
		int size=scan.nextInt();
		//input creation
		int[] a=new int[size];
		int[] b=new int[size];
		int[] sum=new int[size];
		//array input
		for(int i=0;i<size;i++)
		{
			//input for first array
			System.out.println("Please enter element for array a index"+i);
			a[i]=scan.nextInt();
			//input for second array
			System.out.println("Please enter element for array b index"+i);
			b[i]=scan.nextInt();
		}
		//adding & printing sum array
		for(int i=0;i<size;i++)
		{
			sum[i]=a[i]+b[i];
					System.out.println(sum[i]+"");
		}
	}

}
