package Exception;

import java.util.Scanner;

public class TryandCatch {
	public static  void main(String[]args) {
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("Please enter the size of array");
			int size=scan.nextInt();
			int arr[]=new int[size];
			System.out.println("Please enter array elements");
			for(int i=0;i<arr.length;i++) {
				arr[i]=scan.nextInt();
			}
			System.out.println("Please enter array index to access element");
			int idx=scan.nextInt();
			System.out.println("Array element"+arr[idx]);
		}
		catch(NegativeArraySizeException e1) {
			System.out.println("Please enter positive array size");
		}
	catch
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println("Please enter a positive array size");
		}
		
	}

}
