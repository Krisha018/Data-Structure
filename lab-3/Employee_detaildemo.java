import java.util.*;
 class Employee_details
{
	int Employee_id;
	String Name;
	String Designation;
	Double Salary;
public void readdetail()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Employee_id");
	 Employee_id=sc.nextInt();
	System.out.println("Name");
	 Name=sc.next();
	System.out.println("Designation");
	Designation=sc.next();
	System.out.println("Salary");
	Salary=sc.nextDouble();
}
public void print()
{
	
	System.out.println(Employee_id);
	System.out.println(Name);
	System.out.println(Designation);
	System.out.println(Salary);
}
}
public class Employee_detaildemo 	
{
	public static void main(String[] args)
	{
		Employee_details a=new Employee_details();
		a.readdetail();
		a.print();
	}
}