package String;

import java.util.Scanner;

public class StringReverseWord {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a sentence");
		String str=scan.nextLine();
		
		String[] words=str.split(" ");
		//System.out.println(words.length);
		
		for(int i=0;i<words.length;i++)
		{
			String temp=words[i];
			String rev="";
			for(int j=temp.length()-1;j>=0;j--)
			{
				rev=rev+temp.charAt(j);
			
		}
		System.out.print( rev);//there need to be a space between words
			
		}

}
}
