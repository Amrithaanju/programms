package Test;

public class Reverse {
	public static void main(String[]args)
	{
		String s="amritha";
		char[] c=s.toCharArray();
		String rev="";
		for(int i=c.length-1;i>=0;i--)
		{
			rev=rev+c[i];
		}
		System.out.println(rev);
	}

}
