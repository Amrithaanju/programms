package Test;
import java.util.Scanner;
public class AllPrimenumbers {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 1st number");
		int a=scan.nextInt();
		System.out.println("Please enter 2nd number");
		int b=scan.nextInt();
		for(int num=a;num<=b;num++)
		{
			int fact=0;
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					fact++;
					}
				}
			if(fact==2)
			{
				System.out.println(num);
			}
		}
	}

}
