package Arrays;
import java.util.Scanner;
public class ArrayMerging {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the array size");
		int size=scan.nextInt();
		
		
		int [] a=new int[size];
		int [] b=new int[size];
		int [] c=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Please enter the elements for array a index"+i);
			a[i]=scan.nextInt();
		}
		for(int i=0;i<size-1;i++)
		{
			System.out.println("Please enter element for array b index"+i);
			b[i]=scan.nextInt();
		}
		//for()
	}

}

