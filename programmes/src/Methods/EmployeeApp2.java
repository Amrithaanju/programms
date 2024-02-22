package Methods;

public class EmployeeApp2 {
	public static void main(String[]args)
	{
		Employee emp=new Employee();
		emp.emp_Id=100;
		emp.emp_Name="Amritha";
		emp.emp_Desg="Developer";
		emp.emp_Salary=30000;
		System.out.println(emp.emp_Id+" "+emp.emp_Name+" "+emp.emp_Desg+" "+emp.emp_Salary);
		emp.doJob();
		emp.applyLeave();
		emp.giveInfo();	
	}

}

class Employee
{
	int emp_Id;
	String emp_Name;
	String emp_Desg;
	int emp_Salary;
	void doJob()
	{
		System.out.println("Do Job");
	}
	void applyLeave()
	{
		System.out.println("Apply for leave");
	}
	void giveInfo()
	{
		System.out.println("Give information");
	}
}