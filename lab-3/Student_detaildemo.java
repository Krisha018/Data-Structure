import java.util.*;
 class Student_detail
{
	String Enrollment_no;
	String Name;
	int Sem;
	Double CPI;
	
public void S_detail_get()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Enrollment_no");
	Enrollment_no=sc.next();
	System.out.println("Enter Name");
	Name=sc.next();
	System.out.println("Enter Sem");
	Sem=sc.nextInt();
	System.out.println("Enter CPI");
	CPI=sc.nextDouble();
}
public void print_detail()
{
	System.out.println(Enrollment_no);
	System.out.println(Name);
	System.out.println(Sem);
	System.out.println(CPI);
}
}
public class Student_detaildemo
{
	public static void main(String[] args)
	{
		Student_detail obj[]=new Student_detail[5];
		for(int i=0;i<5;i++)
		{
			obj[i]= new Student_detail();
			obj[i].S_detail_get();
			obj[i].print_detail();

		}
		
	}
}
