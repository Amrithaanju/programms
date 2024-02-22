package String;
import java.util.Scanner;
public class UniqueString {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a string");
		String s1=scan.nextLine();
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(s2.contains(ch+"")==false)
			{
				s2=s2+ch;	
			}
		}
		System.out.println(s2);	
			
		
	}

}
