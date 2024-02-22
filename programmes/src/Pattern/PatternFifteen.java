package Pattern;

public class PatternFifteen {
	public static void main(String[]args)
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j*10);
				if(j<i)
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}

}
