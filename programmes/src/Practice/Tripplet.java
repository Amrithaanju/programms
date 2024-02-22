package Practice;

import java.util.Scanner;

public class Tripplet {
	public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	int N=scan.nextInt();
	int d=scan.nextInt();
	int[]a=new int[N];
	int count=0;
	for(int i=0;i<N;i++)
	{
		a[i]=scan.nextInt();
	}
	for(int i=0;i<a.length-2;i++)
	{
		for(int j=i+1;j<a.length-1;j++)
		{
			if(a[j]-a[i]==d)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[k]-a[j]==d)
					{
						count++;
						break;
					}
				}
			break;
		}
	
	}

}
	System.out.println(count);
}
}
