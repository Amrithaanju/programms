package Framework;

public class ClassApp {
public static void main(String[]args) {
	Student stud=new Student(1,"Deep");
	System.out.println("Student ref:"+stud);
	String str=new String("Java");
	System.out.println("String ref:"+str);
}
}
class Student
{
	int roll;
	String name;
	Student(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
	public String toString()
	{
		return roll+" "+name;
	}
}
