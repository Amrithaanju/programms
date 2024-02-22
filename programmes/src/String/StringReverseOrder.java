package String;

import java.util.Scanner;

public class StringReverseOrder {
	 public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Please enter a sentence");
			String str=scan.nextLine();
			
			String[] words=str.split(" ");
			//System.out.println(words.length);
			String s2= "";
			for(int i=words.length-1;i>=0;i--)
			{
				s2=s2+words[i]+" ";
			}
			System.out.println(s2.trim());
				
			}


}
