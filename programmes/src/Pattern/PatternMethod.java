package Pattern;

public class PatternMethod {
	public static void main(String[]args)
	{
		displayPyramid();
		displayInvertedPyramid();
		
	}
	public static void displayPyramid()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=(5-i);j++)
			{
				System.out.print("-");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
				if(k<i)
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	public static void displayInvertedPyramid()
	{
		//lines
		for(int i=1;i<=4;i++)
		{
			//spaces
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			//stars
			for(int k=1;k<=(5-i);k++)
			{
				System.out.print("*");
				if(k<(5-i))
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
