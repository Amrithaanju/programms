package Arrays;

import java.util.Scanner;

public class ArrayLinearSearch2 {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter the array size");
	int size=scan.nextInt();
	//array creation
	char[] c=new char[size];
	//scan.nextLine();
	for(int i=0;i<c.length;i++)
	{
		System.out.println("Please enter element for index"+i);
		c[i]=scan.nextLine().charAt(0);
	}
	System.out.println("Please enter key to search");
	char key=scan.nextLine().charAt(0);
	
	public void linearSearch(int[]ar,int key)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(key==ar[i])
			{
				System.out.println("Key found");
				return;
			}
		}
		System.out.println("Key not found");
	}

}
}
