package Practice;
import java.util.Scanner;
public class ZandOs {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();   //should be zzoo orzzzoooooo anything with zoo
		s=s.toLowerCase();
		int z=0; //count
		int o=0; //count
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='z')
			{
				z++;    //z count
			}
			else if(s.charAt(i)=='o')
			{
				o++;    //o count
			}
		}
		if(z*2==o)
		{
			System.out.println("Yes");
			}
		else
			System.out.println("No");
	}

}
