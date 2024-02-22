package String;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagrams {
	
		public static void main(String[]args)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Please enter a string");
			String s1=scan.nextLine();
			char[] c1=s1.toCharArray();
			
			System.out.println("Please enter a string");
			String s2=scan.nextLine();
			char[] c2=s2.toCharArray();
			

			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1,c2))
			{
				System.out.println("Strings are anagrams!");
			}
			else {
				System.out.println("Strings are not anagrams!");
			}
			
		}
}


