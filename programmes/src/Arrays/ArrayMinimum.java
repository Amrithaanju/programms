package Arrays;

import java.util.Scanner;

public class ArrayMinimum {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter array size");
	int size=scan.nextInt();
	int [] a=new int[size];
	for(int i=0;i<size;i++)
	{
		System.out.println("Please enter the elements"+i);
		a[i]=scan.nextInt();
	}
	int min=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println("Smallest : "+min);

	}

}
