package Test;

public class RecursionTest {
	public static void main(String[]args)
	{
		fun(1);
	}
	public static void fun(int n)
	{
		if(n==3)
		{
			return;
		}
		System.out.println(n);
		fun(n+1);
	}

}
