package String;
import java.util.Scanner;
public class StringUnique {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a string");
		String s=scan.nextLine();
		System.out.println(isUnique(s));
	}
	public static boolean isUnique(String s) {
		//traversing the string
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(ch==s.charAt(j)) {
					count++;
				}
			}
			if(count>1)
			{
				return false;
			}
		}
		return true;
	}

}
