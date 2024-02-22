package Test;

public class InternDemo {
	public static void main(String[]args)
	{
		String s1=new String("hello");
		String s2=s1.intern();
		String s3=new String("hello");
		String s4=s3.intern();
		System.out.println(s3==s4);
	}

}
