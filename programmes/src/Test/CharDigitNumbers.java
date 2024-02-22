package Test;
import java.util.Scanner;
public class CharDigitNumbers {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a string");
		String s=scan.nextLine();
		System.out.println("Original string:"+s);
		
		int alpha=0, v=0, c=0, dig=0,others=0;
		for(int i=0;i<s.length();i++)
		{
			char temp=s.charAt(i);
			//alphabets
			if(temp>='a' && temp<='z')
			{
				alpha++;
				//vowels
				if(temp=='a' || temp=='e' || temp=='i' ||temp=='o' || temp=='u')
				{
					v++;
				}
				else {
					c++;
				}
			}
			//digits
			else if(temp>='0' && temp<='9')
			{
				dig++;
			}
			//others
			else
			{
				others++;
			}
		}
		System.out.println("Alphabets="+alpha);
		System.out.println("Vowels="+v);
		System.out.println("Consonants="+c);
		System.out.println("digits="+dig);
		System.out.println("Others="+others);
	}

}
