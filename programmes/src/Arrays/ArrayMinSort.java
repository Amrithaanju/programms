package Arrays;

import java.util.Scanner;

public class ArrayMinSort {  //Ascending Order
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter array size");
		int size=scan.nextInt();  //n=size
		int []a=new int[size];
		for(int i=0;i<=size-1;i++)
		{
			System.out.println("Please enter the elements");
			a[i]=scan.nextInt();
		}
		//For sorting
		for(int i=0;i<=size-2;i++)
		{
			int min=i;
			for(int j=i;j<=size-1;j++)
			{
				//finding minimum
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			//Swapping
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
}
}



//for(int i=0;i<=size-2;i++)
//{
//	for(int j=i;j<=n-1;j++)
//}
//operation
//}
//}

 

