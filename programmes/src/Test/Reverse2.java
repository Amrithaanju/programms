package Test;
import java.util.Scanner;
public class Reverse2 {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a string");
		String s=scan.nextLine();
		System.out.println("original string:"+s);
		char [] c=s.toCharArray();
		String rev="";
		for(int i=c.length-1;i>=0;i--)
		{
			rev=rev+c[i];
		}
		System.out.println(rev);
	}

}
