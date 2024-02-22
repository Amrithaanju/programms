package Arrays;

import java.util.Scanner;

public class ThreeDArray {
	public static void main(String[]args)
	{	
		Scanner scan=new Scanner(System.in);
		
		names[][][]="";
		names[][][]="";
		names[][][]="";
		
		names[][][]="";
		names[][][]="";
		names[][][]="";
		
		names[][][]="";
		names[][][]="";
		names[][][]="";
		
		names[][][]="jjj";
		names[][][]="kkk";
		names[][][]="lll";
		
		//blocks
		for(int i=0;i<names.length;i++)
		{
			//rows
			for(int j=0;i<names[i].length;j++)
			{
				//columns
				for(int k=0;k<names[i][j].length;k++)
				{
					System.out.print(names[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}


}
