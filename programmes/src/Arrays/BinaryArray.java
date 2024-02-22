package Arrays;

import java.util.Scanner;

public class BinaryArray {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the array size");
		int size=scan.nextInt();
		//array creation
		int[] arr=new int[size];
		
		//array input
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Please enter element for index"+i);
			arr[i]=scan.nextInt();
		}
		//original array output
		System.out.println("Array elements-");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the key to search");
		int key=scan.nextInt();
		//binary search
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		
		while(low<=high) {
			if(key == arr[mid]) {
				System.out.println("Key found");
				return;
			}
			else if(key>arr[mid]) {
				low=mid+1;
				
			}
			else if(key<arr[mid]) {
				high=mid-1;
			}
			mid=(low+high)/2;
		}
		System.out.println("Key not found");
}

}
