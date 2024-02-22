package String;
import java.util.Scanner;
public class StringPangram {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a string");
		String s=scan.nextLine();
		for(char i='a';i<='z';i++)
		{
			if(s.contains(i+"")==false)
			{
				System.out.println("Not a Pangram");
				return;
			}
		
	}
		System.out.println("Pangram");
	

}
}
