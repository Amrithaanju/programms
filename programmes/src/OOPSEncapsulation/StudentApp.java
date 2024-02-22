package OOPSEncapsulation;

public class StudentApp {
	public static void main(String[]args)
	{
		//1st object
		//assigning values using constructor
		Student st1=new Student(1,"Amritha");
		//getting / fetching values
		System.out.println("Roll:"+st1.getRoll());
		System.out.println("Name:"+st1.getName());
		
		//2nd object
		Student st2=new Student();
		st2.setRoll(2);
		st2.setName("Monika");
		//getting / fetching values
				System.out.println("Roll:"+st2.getRoll());
				System.out.println("Name:"+st2.getName());
	}

}

class Student{
	//declaring data members
	private int roll;
	private String name;
	
	//0-parameter constructor
	public Student() {
	
	}
	
	
	//Parameterized constructors for setters for 1st
	public Student(int roll,String name) {
		this.roll=roll;
		this.name=name;
	}
	//setter for 2nd/
	public void setRoll(int roll) {
		this.roll=roll;
	}
	public void setName(String name) {
		this.name=name;
	}

//getters
public int getRoll() {
	return roll;
}
public String getName() {
	return name;
}
}
